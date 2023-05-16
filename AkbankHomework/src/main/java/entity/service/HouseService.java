package entity.service;

import entity.Building;

import java.util.List;

public class HouseService {
    private List<Building> buildingList;

    public HouseService(List<Building> buildingList) {
        this.buildingList = buildingList;
    }
    public <T extends Building>List<T> getListByType(List<T> estates, String type) {
        return estates.stream().filter(estate -> estate.getType() == type).toList();
    }

    // Created get total price by type functions
    public double getTotalPriceByType(String type) {
        return buildingList.stream().filter(building -> building.getType() == type).mapToDouble(building -> building.getPrice()).sum();
    }

    // Created get total price functions
    public double getTotalPrice() {
        return buildingList.stream().mapToDouble(building -> building.getPrice()).sum();
    }

    // Created get average area by type functions
    public double getAverageAreaByType(String type) {
        return buildingList.stream().filter(building -> building.getType() == type).mapToDouble(estate -> estate.getSquareMeters()).sum() / buildingList.stream().filter(estate -> estate.getType() == type).count();
    }

    // Created get average area functions
    public double getAverageArea() {
        return buildingList.stream().mapToDouble(building -> building.getSquareMeters()).sum() / buildingList.size() ;
    }

    // Created filter by room and living room functions
    public <T extends Building>List<T> filterByRoomAndLivingRoom(List<T> houses, int roomCount, int livingRoomCount) {
        return houses.stream().filter(response -> response.getRoomCount() == roomCount && response.getLivingRoomCount() == livingRoomCount).toList();
    }
}
