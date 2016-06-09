package com.thoughtworks.mvc.smart.core;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CoreConfigurationReaderTest {
    @Test
    public void should_return_correct_base_package_configuration_when_read() throws Exception {
        CoreConfigurationReader reader = new CoreConfigurationReader();

        assertThat(reader.getBasePackage(), is("com.thoughtworks.opensource.demo"));
    }

    @Test
    public void should_return_WEB_INF_view_when_read_jsp_file_path_configuration() throws Exception {
        CoreConfigurationReader reader = new CoreConfigurationReader();

        assertThat(reader.getJspPath(), is("/WEB-INF/views"));
    }
}