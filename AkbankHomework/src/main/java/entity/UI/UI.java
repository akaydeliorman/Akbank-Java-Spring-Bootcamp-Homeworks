package entity.UI;

import entity.Building;
import entity.service.HouseService;

import java.util.List;
import java.util.Scanner;

public class UI {
    public void printOutput(List<Building> buildingList){
        // Created House Service
        HouseService houseService = new HouseService(buildingList);

        // Created select menu
        System.out.println("Please select the building type:" +
                "\n1- House List" +
                "\n2- Summerhouse List" +
                "\n3- Villa List" +
                "\n4-All Houses Details" +
                "\n5-Filter House ");
        Scanner input = new Scanner(System.in);
        int selected;
        selected = input.nextInt();

        while (selected<6) {
            switch (selected) {
                case 1:
                    for (Building house : houseService.getListByType(buildingList, "House")) {
                        System.out.println("-----------------------------------------------------");
                        System.out.println("-HOUSE LIST-");
                        System.out.println("Price : " + house.getPrice());
                        System.out.println("Square Meter : " + house.getSquareMeters());
                        System.out.println("Room Count : " + house.getRoomCount());
                        System.out.println("Living Room Count : " + house.getLivingRoomCount());
                    }
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Total price: " + houseService.getTotalPriceByType("House"));
                    System.out.println("Average square meters: " + houseService.getAverageAreaByType("House"));
                    System.out.println("-----------------------------------------------------");
                    break;
                case 2:

                    for (Building house : houseService.getListByType(buildingList, "SummerHouse")) {
                        System.out.println("-----------------------------------------------------");
                        System.out.println("-SUMMERHOUSE LIST-");
                        System.out.println("Price : " + house.getPrice());
                        System.out.println("Square Meter : " + house.getSquareMeters());
                        System.out.println("Room Count : " + house.getRoomCount());
                        System.out.println("Living Room Count : " + house.getLivingRoomCount());
                    }
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Total price: " + houseService.getTotalPriceByType("SummerHouse"));
                    System.out.println("Average square meters: " + houseService.getAverageAreaByType("SummerHouse"));
                    System.out.println("-----------------------------------------------------");
                    break;

                case 3:

                    for (Building house : houseService.getListByType(buildingList, "Villa")) {
                        System.out.println("-----------------------------------------------------");
                        System.out.println("-VILLA LIST-");
                        System.out.println("Price : " + house.getPrice());
                        System.out.println("Square Meter : " + house.getSquareMeters());
                        System.out.println("Room Count : " + house.getRoomCount());
                        System.out.println("Living Room Count : " + house.getLivingRoomCount());
                    }
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Total price: " + houseService.getTotalPriceByType("Villa"));
                    System.out.println("Average square meters: " + houseService.getAverageAreaByType("Villa"));
                    System.out.println("-----------------------------------------------------");
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Total price of all houses: $" + houseService.getTotalPrice());
                    System.out.println("Average square meters of all houses: " + houseService.getAverageArea());
                    System.out.println("-----------------------------------------------------");
                    break;
                case 5:
                    Scanner count = new Scanner(System.in);
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Select room count: ");
                    int roomCount = count.nextInt();
                    System.out.println("Select living room count: ");
                    int livingRoomCount = count.nextInt();
                    List<Building> filteredHouses = houseService.filterByRoomAndLivingRoom(buildingList, roomCount, livingRoomCount);
                    System.out.println("Houses with " + roomCount + " rooms and " + livingRoomCount + " living rooms:");
                    for (Building building : filteredHouses) {
                        System.out.println(building.getType() + " : $" + building.getPrice() + " - " + building.getSquareMeters() + " square meters");
                    }
                    System.out.println("-----------------------------------------------------");
                    break;
                default:
                    System.out.println("Please choose one of the given in the menu!" +
                            "\n1- House List" +
                            "\n2- Summerhouse List" +
                            "\n3- Villa List");
                    break;
            }
            System.out.println("Please select:" +
                    "\n1-House List" +
                    "\n2-Summerhouse List" +
                    "\n3-Villa List" +
                    "\n4-All Houses Details" +
                    "\n5-Filter House ");

            selected = input.nextInt();
        }
    }
}
