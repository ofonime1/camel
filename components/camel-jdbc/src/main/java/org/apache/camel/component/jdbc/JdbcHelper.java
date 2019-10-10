/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.jdbc;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.util.IntrospectionSupport;

public final class JdbcHelper {

    private JdbcHelper() {
    }

    public static Object newBeanInstance(CamelContext camelContext, String outputClass,
                                         BeanRowMapper beanRowMapper, Map<String, Object> row) throws SQLException {
        Class<?> clazz = camelContext.getClassResolver().resolveClass(outputClass);
        Object answer = camelContext.getInjector().newInstance(clazz);

        Map<String, Object> properties = new LinkedHashMap<>();

        // map row names using the bean row mapper
        for (Map.Entry<String, Object> entry : row.entrySet()) {
            Object value = entry.getValue();
            String name = beanRowMapper.map(entry.getKey(), value);
            properties.put(name, value);
        }
        try {
            IntrospectionSupport.setProperties(answer, properties);
        } catch (Exception e) {
            throw new SQLException("Error setting properties on output class " + outputClass, e);
        }

        // check we could map all properties to the bean
        if (!properties.isEmpty()) {
            throw new IllegalArgumentException(
                    "Cannot map all properties to bean of type " + outputClass + ". There are " + properties.size() + " unmapped properties. " + properties);
        }
        return answer;
    }

}