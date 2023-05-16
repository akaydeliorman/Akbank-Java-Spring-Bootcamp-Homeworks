package org.example;

import entity.Building;
import entity.UI.UI;
import entity.house.House;
import entity.service.HouseService;
import entity.summerHouse.SummerHouse;
import entity.villa.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();

        // Created building list
        List<Building> buildingList = new ArrayList<>();

        // House added
        buildingList.add(new House(2, 115, 1, 1500000));
        buildingList.add(new House(3, 130, 1, 3340000));
        buildingList.add(new House(1, 90, 1, 800000));
        // Summerhouse added
        buildingList.add(new SummerHouse(4, 145, 2, 4000000));
        buildingList.add(new SummerHouse(7, 220, 4, 6000000));
        buildingList.add(new SummerHouse(5, 170, 4, 4500000));
        // Villa added
        buildingList.add(new Villa(6, 200, 4, 4500000));
        buildingList.add(new Villa(9, 370, 6, 8500000));
        buildingList.add(new Villa(8, 345, 7, 7250000));

        ui.printOutput(buildingList);
    }
}