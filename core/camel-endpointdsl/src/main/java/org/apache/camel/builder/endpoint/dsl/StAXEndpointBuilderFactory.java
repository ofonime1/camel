/*
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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The stax component allows messages to be process through a SAX
 * ContentHandler.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface StAXEndpointBuilderFactory {


    /**
     * Builder for endpoint for the StAX component.
     */
    public static interface StAXEndpointBuilder
            extends
                EndpointProducerBuilder {
        public default AdvancedStAXEndpointBuilder advanced() {
            return (AdvancedStAXEndpointBuilder) this;
        }
        /**
         * The FQN class name for the ContentHandler implementation to use.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public default StAXEndpointBuilder contentHandlerClass(
                String contentHandlerClass) {
            setProperty("contentHandlerClass", contentHandlerClass);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the StAX component.
     */
    public static interface AdvancedStAXEndpointBuilder
            extends
                EndpointProducerBuilder {
        public default StAXEndpointBuilder basic() {
            return (StAXEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedStAXEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedStAXEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedStAXEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedStAXEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The stax component allows messages to be process through a SAX
     * ContentHandler. Creates a builder to build endpoints for the StAX
     * component.
     */
    public default StAXEndpointBuilder stAX(String path) {
        class StAXEndpointBuilderImpl extends AbstractEndpointBuilder implements StAXEndpointBuilder, AdvancedStAXEndpointBuilder {
            public StAXEndpointBuilderImpl(String path) {
                super("stax", path);
            }
        }
        return new StAXEndpointBuilderImpl(path);
    }
}