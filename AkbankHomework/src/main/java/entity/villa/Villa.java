package entity.villa;

import entity.Building;

public class Villa extends Building {

    // Extended class parameters and override function
    public Villa(int roomCount, double squareMeters, int livingRoomCount, double price) {
        super(roomCount, squareMeters, livingRoomCount, price);
    }
    @Override
    public String getType() {
        return "Villa";
    }
}
