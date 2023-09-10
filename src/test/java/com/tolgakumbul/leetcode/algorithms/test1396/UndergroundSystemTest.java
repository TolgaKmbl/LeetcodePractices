package com.tolgakumbul.leetcode.algorithms.test1396;

import com.tolgakumbul.leetcode.algorithms.question1396.UndergroundSystem;
import org.junit.Assert;
import org.junit.Test;

public class UndergroundSystemTest {

    @Test
    public void testUndergroundSystem() {
        /**
         * ["UndergroundSystem",
         * "checkIn",
         * "checkOut",
         * "getAverageTime",
         * "checkIn",
         * "checkOut",
         * "getAverageTime",
         * "checkIn",
         * "checkOut",
         * "getAverageTime"]
         *
         * [10,"Leyton",3],
         * [10,"Paradise",8],
         * ["Leyton","Paradise"],
         * [5,"Leyton",10],
         * [5,"Paradise",16],
         * ["Leyton","Paradise"],
         * [2,"Leyton",21],
         * [2,"Paradise",30],
         * ["Leyton","Paradise"]
         */
        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(10, "Leyton", 3);
        undergroundSystem.checkOut(10,"Paradise",8);
        Assert.assertEquals(5.00d, undergroundSystem.getAverageTime("Leyton", "Paradise"), 0.01);
        undergroundSystem.checkIn(5, "Leyton", 10);
        undergroundSystem.checkOut(5,"Paradise",16);
        Assert.assertEquals(5.50d, undergroundSystem.getAverageTime("Leyton", "Paradise"), 0.01);
        undergroundSystem.checkIn(2,"Leyton",21);
        undergroundSystem.checkOut(2,"Paradise",30);
        Assert.assertEquals(6.66d, undergroundSystem.getAverageTime("Leyton", "Paradise"), 0.01);

        /**
         * ["UndergroundSystem",
         * "checkIn","checkIn","checkIn",
         * "checkOut","checkOut","checkOut",
         * "getAverageTime","getAverageTime",
         * "checkIn","getAverageTime",
         * "checkOut","getAverageTime"]
         *
         *
         * [45,"Leyton",3],[32,"Paradise",8],[27,"Leyton",10],
         * [45,"Waterloo",15],[27,"Waterloo",20],[32,"Cambridge",22],
         * ["Paradise","Cambridge"],["Leyton","Waterloo"],
         * [10,"Leyton",24],["Leyton","Waterloo"],
         * [10,"Waterloo",38],["Leyton","Waterloo"]]
         */
        undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(45,"Leyton",3);
        undergroundSystem.checkIn(32,"Paradise",8);
        undergroundSystem.checkIn(27,"Leyton",10);
        undergroundSystem.checkOut(45,"Waterloo",15);
        undergroundSystem.checkOut(27,"Waterloo",20);
        undergroundSystem.checkOut(32,"Cambridge",22);
        Assert.assertEquals(14.00d, undergroundSystem.getAverageTime("Paradise","Cambridge"), 0.01);
        Assert.assertEquals(11.00d, undergroundSystem.getAverageTime("Leyton","Waterloo"), 0.01);
    }

}
