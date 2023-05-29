package org.akaydeliorman.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.akaydeliorman.enums.SectorType;
import org.akaydeliorman.service.Impl.BillServiceImpl;

import java.time.Month;

@Getter
@Setter

public class Bill extends Company{

    private Double price;
    private Month billDate;

    // Constructors

    public Bill(String name, SectorType sectorType) {
        super(name, sectorType);
    }

    public Bill(String name, SectorType sectorType, Double price, Month billDate) {
        super(name, sectorType);
        this.price = price;
        this.billDate = billDate;
    }
}
