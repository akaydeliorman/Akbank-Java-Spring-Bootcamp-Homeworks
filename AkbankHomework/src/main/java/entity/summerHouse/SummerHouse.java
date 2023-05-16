package entity.summerHouse;

import entity.Building;

public class SummerHouse extends Building {

    // Extended class parameters and override function
    public SummerHouse(int roomCount, double squareMeters, int livingRoomCount, double price) {
        super(roomCount, squareMeters, livingRoomCount, price);
    }
    @Override
    public String getType() {
        return "SummerHouse";
    }
}
