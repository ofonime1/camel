/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.quartz;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class QuartzEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        QuartzEndpoint target = (QuartzEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autostartscheduler":
        case "autoStartScheduler": target.setAutoStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cron": target.setCron(property(camelContext, java.lang.String.class, value)); return true;
        case "customcalendar":
        case "customCalendar": target.setCustomCalendar(property(camelContext, org.quartz.Calendar.class, value)); return true;
        case "deletejob":
        case "deleteJob": target.setDeleteJob(property(camelContext, boolean.class, value)); return true;
        case "durablejob":
        case "durableJob": target.setDurableJob(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "firenow":
        case "fireNow": target.setFireNow(property(camelContext, boolean.class, value)); return true;
        case "jobparameters":
        case "jobParameters": target.setJobParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "pausejob":
        case "pauseJob": target.setPauseJob(property(camelContext, boolean.class, value)); return true;
        case "prefixjobnamewithendpointid":
        case "prefixJobNameWithEndpointId": target.setPrefixJobNameWithEndpointId(property(camelContext, boolean.class, value)); return true;
        case "recoverablejob":
        case "recoverableJob": target.setRecoverableJob(property(camelContext, boolean.class, value)); return true;
        case "startdelayedseconds":
        case "startDelayedSeconds": target.setStartDelayedSeconds(property(camelContext, int.class, value)); return true;
        case "stateful": target.setStateful(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "triggerparameters":
        case "triggerParameters": target.setTriggerParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "triggerstartdelay":
        case "triggerStartDelay": target.setTriggerStartDelay(property(camelContext, long.class, value)); return true;
        case "usingfixedcamelcontextname":
        case "usingFixedCamelContextName": target.setUsingFixedCamelContextName(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

