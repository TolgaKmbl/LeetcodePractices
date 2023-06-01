package com.tolgakumbul.leetcode.question1603;


import org.springframework.stereotype.Component;

/**
 * Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size.
 *
 * Implement the ParkingSystem class:
 *
 * ParkingSystem(int big, int medium, int small) Initializes object of the ParkingSystem class.
 * The number of slots for each parking space are given as part of the constructor.
 * bool addCar(int carType) Checks whether there is a parking space of carType for the car that wants to get into the parking lot.
 * carType can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively.
 * A car can only park in a parking space of its carType. If there is no space available, return false, else park the car in that size space and return true.
 * https://leetcode.com/problems/design-parking-system/
 */

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
@Component(value = "Question-1603")
public class ParkingSystem {

    /*ATTEMPT 1*/
    /*private int big;
    private int medium;
    private int small;*/

    /*ATTEMPT 2*/
    /*private Map<Integer, Integer> parkingSpace;*/

    private int[] parkingSlots;

    public ParkingSystem(int big, int medium, int small) {
        this.parkingSlots = new int[]{big,medium,small};

        /*this.big = big;
        this.medium = medium;
        this.small = small;*/

        /*parkingSpace = new HashMap();
        parkingSpace.put(1, big);
        parkingSpace.put(2, medium);
        parkingSpace.put(3, small);*/
    }

    public boolean addCar(int carType) {
        if(parkingSlots[carType-1] > 0){
            parkingSlots[carType-1]--;
            return true;
        }
        return false;
        /*int slot = parkingSpace.get(carType);
        if(slot > 0){
            parkingSpace.put(carType, slot-1);
            return true;
        }
        return false;*/

        /*switch(carType){
            case 3:
                if(small > 0){
                    small--;
                    return true;
                }
                return false;
            case 2:
                if(medium > 0){
                    medium--;
                    return true;
                }
                return false;
            case 1:
                if(big > 0){
                    big--;
                    return true;
                }
                return false;
            default:
                return false;
        } */
    }
}

