package com.talabat.talabatinterview;


import java.util.HashMap;
import java.util.Map;

/*
*
* Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium,
* and small, with a fixed number of slots for each size.
Implement the ParkingSystem class:
ParkingSystem(int big, int medium, int small) Initializes object of the ParkingSystem class.
*  The number of slots for each parking space are given as part of the constructor.
bool addCar(int carType) Checks whether there is a parking space of carType for the car that wants to get into the parking lot. carType can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively. A car can only park in a parking space of its carType.
* If there is no space available, return false, else park the car in that size space and return true.
amountOfSpace - you should return amount of space for particular carType
*
* */
class ParkingSystem {


    public Map<CarType, Integer> getSpaceCapacityMap() {
        return spaceCapacityMap;
    }

    private Map<CarType, Integer> spaceCapacityMap = new HashMap<>();

    public ParkingSystem(Map<CarType, Integer> spaceCapacityMap) {
        this.spaceCapacityMap = spaceCapacityMap;
    }


    public boolean addCar(CarType carType) {
        if (spaceCapacityMap.containsKey(carType) && spaceCapacityMap.get(carType) > 0) {
            spaceCapacityMap.put(carType, spaceCapacityMap.get(carType) - 1);
            return true;
        }
        return false;
    }

    public int amountOfSpace(CarType carType) {
        return spaceCapacityMap.getOrDefault(carType, 0);
    }

    public enum CarType {
        BIG,
        MEDIUM,
        SMALL
    }

}
