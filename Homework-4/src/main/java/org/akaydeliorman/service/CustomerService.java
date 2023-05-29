package org.akaydeliorman.service;

import org.akaydeliorman.model.Customer;

import java.time.Month;
import java.util.List;

public interface CustomerService {
    // Customer Service methods
    List<Customer> getAllCustomer();
    List<Customer> getAllCustomerByLetter(String letter);
    List<Customer> getAllCustomerByMonth(Month month);
    void addCustomer(Customer customer);
    List<String> getNameOverBills(Double value);
}
