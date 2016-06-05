package com.thoughtworks.opensource.demo.services;

import com.thoughtworks.opensource.demo.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CustomerService {
    public List<Customer> getCustomerList() {
        return new ArrayList<>(customers);
    }

    public Optional<Customer> getCustomer(long id) {
        return customers.stream().filter(customer -> customer.getId() == id).findFirst();
    }

    public boolean createCustomer(Map<String, Object> information) {

        return false;
    }

    public boolean updateCustomer(long id, Map<String, Object> renewal) {
        return false;
    }

    public boolean deleteCustomer(long id) {
        return false;
    }

    private List<Customer> customers;

    {
        customers = new ArrayList<>();
        customers.add(new Customer().setId(1).setName("Jack").setEmail("jack@smart.com").setPhoneNumber
                ("13142424242").setContacts("Maria").setNotes(""));
        customers.add(new Customer().setId(2).setName("Maria").setEmail("maria@smart.com").setPhoneNumber
                ("15183838383").setContacts("Jackie").setNotes(""));
    }
}