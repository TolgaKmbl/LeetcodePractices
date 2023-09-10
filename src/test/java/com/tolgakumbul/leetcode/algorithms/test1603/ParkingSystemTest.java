package com.tolgakumbul.leetcode.algorithms.test1603;

import com.tolgakumbul.leetcode.algorithms.question1603.ParkingSystem;
import org.junit.Assert;
import org.junit.Test;

public class ParkingSystemTest {

    @Test
    public void testParkingSystem() {
        /*
        * Input
        * ["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
        * [[1, 1, 0], [1], [2], [3], [1]]
        */
        ParkingSystem parkingSystem = new ParkingSystem(1,1,0);
        Assert.assertTrue(parkingSystem.addCar(1));
        Assert.assertTrue(parkingSystem.addCar(2));
        Assert.assertFalse(parkingSystem.addCar(3));
        Assert.assertFalse(parkingSystem.addCar(1));
    }

}
