package com.thoughtworks.mvc.smart.core;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CoreConfigurationReaderTest {
    @Test
    public void should_read_base_package_configuration() throws Exception {
        CoreConfigurationReader reader = new CoreConfigurationReader();

        assertThat(reader.getBasePackage(), is("com.thoughtworks.opensource.demo"));
    }
}