package org.akaydeliorman.service.Impl;

import org.akaydeliorman.enums.SectorType;
import org.akaydeliorman.model.Bill;
import org.akaydeliorman.service.BillService;

import java.time.Month;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BillServiceImpl implements BillService {
    public List<Bill> billList = new ArrayList<>();

    public BillServiceImpl() {
        Bill bill = new Bill("Çiftlik", SectorType.FARMING, 1700.0, Month.JULY);
        Bill bill1 = new Bill("KFC", SectorType.FOOD, 300.0, Month.JUNE);
        Bill bill2 = new Bill("Apple", SectorType.TECHNOLOGICAL, 2400.0, Month.OCTOBER);
        Bill bill3 = new Bill("L’Oréal Paris", SectorType.COSMETIC, 950.0, Month.JUNE);
        Bill bill4 = new Bill("MC-Donalds", SectorType.FOOD, 700.0, Month.NOVEMBER);

        billList.add(bill);
        billList.add(bill1);
        billList.add(bill2);
        billList.add(bill3);
        billList.add(bill4);
    }

    // All list
    @Override
    public List<Bill> getAllBill() {
        return this.billList;
    }

    // Lists under 1500TL
    @Override
    public List<Bill> getOrderGreaterThanValue(Double amount) {
        return billList.stream()
                .filter(bill -> bill.getPrice() > amount)
                .collect(Collectors.toList());
    }

    // Average calculated lists
    @Override
    public double getAverageGreaterThanAmount(Double amount) {
        return billList.stream()
                .filter(order -> order.getPrice() > amount)
                .mapToDouble(Bill::getPrice)
                .average()
                .orElse(0);

    }

    // List of sectors under 750TL by June
    @Override
    public Set<SectorType> getSectorTypeLowerThanAverageBill(Double amount) {
        boolean averageFilter = this.billList.stream().filter((Bill) -> {
            return Bill.getBillDate().getValue() == Month.JUNE.getValue();
        }).mapToDouble(Bill::getPrice).average().orElse(0.0) < amount;
        Set<SectorType> categories = new LinkedHashSet();
        if (averageFilter) {
            categories = (Set) this.billList.stream().filter((Bill) -> {
                return Bill.getBillDate().getValue() == Month.JUNE.getValue();
            }).map((Bill) -> {
                return Bill.getSectorType();
            }).collect(Collectors.toSet());
        }
        return (Set)categories;
    }
}
