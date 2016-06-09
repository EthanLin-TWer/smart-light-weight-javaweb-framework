package com.thoughtworks.mvc.smart.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CoreConfigurationReader {

    private Properties smartCoreConfiguration;
    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    public CoreConfigurationReader() {
        initCoreConfigurationFromPropertyFile();
    }

    private void initCoreConfigurationFromPropertyFile() {
        InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("smart.properties");
        smartCoreConfiguration = new Properties();
        try {
            smartCoreConfiguration.load(stream);
        } catch (IOException e) {
            LOGGER.error("No configuration file 'smart.properties' found in resource root: src/main/resources");
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                LOGGER.warn("Not able to close an input stream used to read 'smart.properties', reasons below: "
                    + e.getMessage());
            }
        }
    }

    String getBasePackage() {
        return (String) smartCoreConfiguration.get(SMART_FRAMEWORK_PROPERTY_PREFIX + "base-package");
    }

    public String getJspPath() {
        return (String) smartCoreConfiguration.get(SMART_FRAMEWORK_PROPERTY_PREFIX + "jsp-path");
    }

    private static final String SMART_FRAMEWORK_PROPERTY_PREFIX = "smart.framework.app.";
}
