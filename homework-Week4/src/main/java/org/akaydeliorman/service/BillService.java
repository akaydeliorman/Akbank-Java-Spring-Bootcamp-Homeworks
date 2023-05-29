package org.akaydeliorman.service;

import org.akaydeliorman.enums.SectorType;
import org.akaydeliorman.model.Bill;

import java.util.List;
import java.util.Set;

public interface BillService {
    // Bill Service methods
    List<Bill> getAllBill();
    List<Bill> getOrderGreaterThanValue(Double amount);
    Set<SectorType> getSectorTypeLowerThanAverageBill(Double amount);
    double getAverageGreaterThanAmount(Double amount);

}
