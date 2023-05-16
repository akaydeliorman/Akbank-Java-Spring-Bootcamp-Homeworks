package entity;

public abstract class Building {
    private int roomCount, livingRoomCount;
    private double price, squareMeters;

    // Created constructor method
    public Building(int roomCount, double squareMeters,int livingRoomCount, double price) {
        this.roomCount = roomCount;
        this.squareMeters = squareMeters;
        this.livingRoomCount = livingRoomCount;
        this.price = price;
    }

    // Created getter and setter functions
    public int getRoomCount() {
        return roomCount;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public int getLivingRoomCount() { return livingRoomCount; }

    public double getPrice() { return price; }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public void setLivingRoomCount(int livingRoomCount) {
        this.livingRoomCount = livingRoomCount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    public abstract String getType();
}
