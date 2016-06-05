package com.thoughtworks.opensource.demo.services;

import com.thoughtworks.opensource.demo.model.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CustomerServiceTest {

    private CustomerService customerService;

    @Before
    public void setUp() throws Exception {
        customerService = new CustomerService();
    }

    @Test
    public void should_get_2_customers_when_get_customer_list() throws Exception {
        List<Customer> customerList = customerService.getCustomerList();

        assertThat(customerList.size(), is(2));
    }

    @Test
    public void should_get_customer_jack_when_query_customer_information_given_id_is_1() throws Exception {
        Optional<Customer> customer = customerService.getCustomer(1);

        assertTrue(customer.isPresent());
        assertThat(customer.get().getName(), is("Jack"));
    }

    @Test
    public void should_return_customer_not_present_when_query_id_doesnot_exists() throws Exception {
        Optional<Customer> customer = customerService.getCustomer(3);

        assertFalse(customer.isPresent());
    }
}