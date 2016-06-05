package com.thoughtworks.opensource.demo.controllers;

import com.thoughtworks.opensource.demo.model.Customer;
import com.thoughtworks.opensource.demo.services.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/customers/list")
public class CustomerListServlet extends HttpServlet{
    private CustomerService customerService;

    public CustomerListServlet() {}

    protected CustomerListServlet(CustomerService customerService) {
        // This is for testing code to inject the service since pure servlet doesn't support dependency injection,
        // which could be a real trouble for unit testing. And therefore the empty constructor above must be provided
        // for servlet container to finish instantiation by calling empty constructor though reflection
        this.customerService = customerService;
    }

    @Override
    public void init() throws ServletException {
        customerService = new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        List<Customer> customerList = customerService.getCustomerList();

        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("/WEB-INF/views/customer-list.jsp").forward(request, response);
    }

}