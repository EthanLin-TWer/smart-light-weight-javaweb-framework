package com.thoughtworks.opensource.demo.controllers;

import com.thoughtworks.opensource.demo.model.Customer;
import com.thoughtworks.opensource.demo.services.CustomerService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class CustomerListServletTest {
    @Mock HttpServletRequest request;
    @Mock HttpServletResponse response;
    @Mock RequestDispatcher requestDispatcher;

    @Mock CustomerService customerService;
    private CustomerListServlet customerListServlet;

    @Before
    public void setUp() throws Exception {
        initMocks(this);

        customerListServlet = new CustomerListServlet(customerService);
    }

    @Test
    public void should_call_customer_service_to_get_a_list_of_customers() throws Exception {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer());

        given(customerService.getCustomerList()).willReturn(customerList);
        given(request.getRequestDispatcher("/WEB-INF/views/customer-list.jsp")).willReturn(requestDispatcher);

        customerListServlet.doGet(request, response);

        verify(customerService).getCustomerList();
        verify(request).setAttribute("customerList", customerList);
        verify(request).getRequestDispatcher("/WEB-INF/views/customer-list.jsp");
        verify(requestDispatcher).forward(request, response);
    }
}