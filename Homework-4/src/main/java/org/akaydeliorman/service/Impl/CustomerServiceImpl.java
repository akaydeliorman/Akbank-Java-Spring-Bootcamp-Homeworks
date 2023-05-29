package org.akaydeliorman.service.Impl;

import org.akaydeliorman.model.Bill;
import org.akaydeliorman.model.Customer;
import org.akaydeliorman.service.CustomerService;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerServiceImpl implements CustomerService {
    // Customer Service Implements and created custormer list
    public List<Customer> customerList = new ArrayList<>();
    public CustomerServiceImpl() {
        Customer customer = new Customer("USER A", Month.JULY,List.of(new Bill[]{(Bill) (new BillServiceImpl()).billList.get(0)}));
        Customer customer1 = new Customer("USER B", Month.APRIL,List.of(new Bill[]{(Bill) (new BillServiceImpl()).billList.get(1)}));
        Customer customer2 = new Customer("USER C", Month.AUGUST,List.of(new Bill[]{(Bill) (new BillServiceImpl()).billList.get(2)}));
        Customer customer3 = new Customer("USER D", Month.JUNE,List.of(new Bill[]{(Bill) (new BillServiceImpl()).billList.get(3)}));
        Customer customer4 = new Customer("USER E", Month.JUNE,List.of(new Bill[]{(Bill) (new BillServiceImpl()).billList.get(4)}));

        addCustomer(customer);
        addCustomer(customer1);
        addCustomer(customer2);
        addCustomer(customer3);
        addCustomer(customer4);
    }
    // List Customers
    @Override
    public List<Customer> getAllCustomer() {
        return customerList;
    }

    // Customers listed by letter 'C'
    @Override
    public List<Customer> getAllCustomerByLetter(String letter) {
        return customerList.stream()
                .filter(customer -> customer.getName().contains("C") || customer.getName().contains("c"))
                .collect(Collectors.toList());
    }

    // Customers listed by June
    @Override
    public List<Customer> getAllCustomerByMonth(Month month) {
        return customerList.stream()
                .filter(customer -> customer.getRegistrationDate().equals(month))
                .collect(Collectors.toList());
    }

    // Customers added to the list
    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    // Customers listed by invoices under 500 TL
    @Override
    public List<String> getNameOverBills(Double amount) {
        return (List)this.customerList.stream().filter((customer) -> {
            return customer.getBillList().stream().anyMatch((Bill) -> {
                return Bill.getPrice() < amount;
            });
        }).map((customer) -> {
            return customer.getName();
        }).collect(Collectors.toList());
    }
}

