package com.thoughtworks.mvc.smart.core;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/")
public class SmartDispatcherServlet extends HttpServlet {

    private CoreConfigurationReader configurationReader;

    public SmartDispatcherServlet() {
        this.configurationReader = new CoreConfigurationReader();
    }

    public SmartDispatcherServlet(CoreConfigurationReader configurationReader) {
        this.configurationReader = configurationReader;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String basePackage = configurationReader.getBasePackage().replace(".", "/");
        String path = new File(".").getCanonicalPath();
        System.out.println(path);

        System.out.println(configurationReader.getBasePackage());
    }

    public static void main(String[] args) throws ServletException, IOException {
        new SmartDispatcherServlet().doGet(null, null);
    }
}
