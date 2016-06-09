package com.thoughtworks.mvc.smart.core;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CoreConfigurationReader {

    private Properties smartCoreConfiguration;
    public static final String SMART_FRAMEWORK_PROPERTY_PREFIX = "smart.framework.app.";

    public CoreConfigurationReader(Properties smartCoreConfiguration) {
        this.smartCoreConfiguration = smartCoreConfiguration;
    }

    public CoreConfigurationReader() {
        InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("smart.properties");
        smartCoreConfiguration = new Properties();
        try {
            smartCoreConfiguration.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String getBasePackage() {
        return (String) smartCoreConfiguration.get(SMART_FRAMEWORK_PROPERTY_PREFIX + "base-package");
    }
}
