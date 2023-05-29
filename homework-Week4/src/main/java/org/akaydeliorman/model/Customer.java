package org.akaydeliorman.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@Getter
@Setter

public class Customer {
    private String name;
    private Month registrationDate;
    private List<Bill> billList;

    // Constructor

    public Customer(String name, Month registrationDate, List<Bill> billList) {
        this.name = name;
        this.registrationDate = registrationDate;
        this.billList = billList;
    }
}
