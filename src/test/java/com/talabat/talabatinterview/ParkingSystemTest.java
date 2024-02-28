package com.talabat.talabatinterview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

/*
*
* Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium,
* and small, with a fixed number of slots for each size.
Implement theParkingSystemclass:
ParkingSystem(int big, int medium, int small)
* Initializes object of theParkingSystemclass.
*  The number of slots for each parking space are given as part of the constructor.
bool addCar(int carType)Checks whether there is a parking space ofcarType
* for the car that wants to get into the parking lot.carType can be of three kinds: big, medium, or small, which are represented by1,2, and3respectively.A car can only park in a parking space of itscarType.
* If there is no space available, returnfalse, else park the car in that size space and returntrue.
amountOfSpace - you should return amount of space for particular carType
*
* */
class ParkingSystemTest {


    @Test
    public void test_should_cant_park_more_than_2_bigCar() {

        ParkingSystem parkingSystem = new ParkingSystem(new HashMap<ParkingSystem.CarType, Integer>() {{
            put(ParkingSystem.CarType.BIG, 2);
        }});

        parkingSystem.addCar(ParkingSystem.CarType.BIG);
        parkingSystem.addCar(ParkingSystem.CarType.BIG);


        Assertions.assertFalse(parkingSystem.addCar(ParkingSystem.CarType.BIG));

    }

    @Test
    public void test_should_park_all_carTypes() {

        // given
        ParkingSystem parkingSystem = new ParkingSystem(new HashMap<ParkingSystem.CarType, Integer>() {{
            put(ParkingSystem.CarType.BIG, 2);
            put(ParkingSystem.CarType.MEDIUM, 1);
            put(ParkingSystem.CarType.SMALL, 1);
        }});


        // when
        parkingSystem.addCar(ParkingSystem.CarType.BIG);
        parkingSystem.addCar(ParkingSystem.CarType.BIG);
        parkingSystem.addCar(ParkingSystem.CarType.MEDIUM);
        parkingSystem.addCar(ParkingSystem.CarType.SMALL);

        // should
        Assertions.assertEquals(0, parkingSystem.amountOfSpace(ParkingSystem.CarType.BIG));
        Assertions.assertEquals(0, parkingSystem.amountOfSpace(ParkingSystem.CarType.MEDIUM));
        Assertions.assertEquals(0, parkingSystem.amountOfSpace(ParkingSystem.CarType.SMALL));

    }

    @Test
    void getSpaceCapacityMap() {
    }

    @Test
    void addCar() {
    }

    @Test
    void amountOfSpace() {
    }
}