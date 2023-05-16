package entity.house;

import entity.Building;

public class House extends Building {

    // Extended class parameters and override function
    public House(int roomCount, double squareMeters, int livingRoomCount, double price) {
        super(roomCount, squareMeters, livingRoomCount, price);
    }
    @Override
    public String getType(){
        return "House";
    }
}
