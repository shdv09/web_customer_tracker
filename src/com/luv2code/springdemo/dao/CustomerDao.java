package com.luv2code.springdemo.dao;

import com.luv2code.springdemo.entity.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> getCustomers();
    void saveCustomer(Customer theCustomer);
    Customer getCustomer(Integer customerId);
}
