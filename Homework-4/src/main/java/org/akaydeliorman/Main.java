package org.akaydeliorman;

import lombok.RequiredArgsConstructor;
import org.akaydeliorman.model.Customer;
import org.akaydeliorman.service.Impl.BillServiceImpl;
import org.akaydeliorman.service.Impl.CustomerServiceImpl;

import java.time.LocalDate;
import java.time.Month;

@RequiredArgsConstructor
public class Main {
    private static final BillServiceImpl billService = new BillServiceImpl();
    private static final CustomerServiceImpl customerService = new CustomerServiceImpl();

    public static void main(String[] args) {
        // Print all methods

        // List all customers print
        System.out.println("---List Customers---\n");
        customerService.customerList
                .forEach(customer -> System.out.println("Customer: " + customer.getName()));

        System.out.println("\n*************************************\n");

        // Customers listed by letter 'C'
        System.out.println("---Customers listed by letter 'C'---\n");
        customerService.getAllCustomerByLetter("c")
                .forEach(customer -> System.out.println(customer.getName()));
        System.out.println("\n*************************************\n");

        // Customers listed by June
        System.out.println("---Customers listed by June---\n");
        customerService.getAllCustomerByMonth(Month.JUNE)
                .forEach(customer -> System.out.println(customer.getName()));
        System.out.println("\n*************************************\n");

        //List all invoices in the system print
        System.out.println("---List all invoices in the system---\n");
        billService.billList
                .forEach(bill -> System.out.println("Price: " + bill.getPrice()));
        System.out.println("\n*************************************\n");

        // Lists higher than 1500TL
        System.out.println("---Lists higher than  1500TL---\n");
        billService.getOrderGreaterThanValue(1500.0)
                .forEach(bill -> System.out.println("Price: " + bill.getPrice()));
        System.out.println("\n*************************************\n");

        // Average calculated lists greater 1500TL
        System.out.println("---Average calculated lists---\n");
        System.out.println(billService.getAverageGreaterThanAmount(1500.0));
        System.out.println("\n*************************************\n");

        // Customers listed by invoices under 500 TL
        System.out.println("---Customers listed by invoices under 500 TL---\n");
        customerService.getNameOverBills(500.0)
                .forEach(System.out::println);
        System.out.println("\n*************************************\n");

        // List of sectors under 750TL by June
        System.out.println("---List of sectors under 750TL by June---\n");
        System.out.println(billService.getSectorTypeLowerThanAverageBill(7500.0));
        System.out.println("\n*************************************\n");
    }
}