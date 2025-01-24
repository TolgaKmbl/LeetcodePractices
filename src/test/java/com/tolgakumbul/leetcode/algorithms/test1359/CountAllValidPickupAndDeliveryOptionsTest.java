package com.tolgakumbul.leetcode.algorithms.test1359;

import com.tolgakumbul.leetcode.algorithms.hard.question1359.CountAllValidPickupAndDeliveryOptions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountAllValidPickupAndDeliveryOptionsTest {

    private CountAllValidPickupAndDeliveryOptions countAllValidPickupAndDeliveryOptions;

    @Before
    public void setUp() {
        countAllValidPickupAndDeliveryOptions = new CountAllValidPickupAndDeliveryOptions();
    }

    @Test
    public void testShortestPathBinaryMatrix() {
        Assert.assertEquals(1, countAllValidPickupAndDeliveryOptions.countOrders(1));
        Assert.assertEquals(6, countAllValidPickupAndDeliveryOptions.countOrders(2));
        Assert.assertEquals(90, countAllValidPickupAndDeliveryOptions.countOrders(3));
        Assert.assertEquals(2520, countAllValidPickupAndDeliveryOptions.countOrders(4));
    }

}
