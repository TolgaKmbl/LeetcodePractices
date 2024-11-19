package com.tolgakumbul.leetcode.algorithms.test622;

import com.tolgakumbul.leetcode.algorithms.medium.question622.MyCircularQueue;
import org.junit.Assert;
import org.junit.Test;

public class MyCircularQueueTest {

    private MyCircularQueue myCircularQueue;

    @Test
    public void testMyCircularQueue(){
        /*
         * MyCircularQueue myCircularQueue = new MyCircularQueue(3);
         * myCircularQueue.enQueue(1); // return True
         * myCircularQueue.enQueue(2); // return True
         * myCircularQueue.enQueue(3); // return True
         * myCircularQueue.enQueue(4); // return False
         * myCircularQueue.Rear();     // return 3
         * myCircularQueue.isFull();   // return True
         * myCircularQueue.deQueue();  // return True
         * myCircularQueue.enQueue(4); // return True
         * myCircularQueue.Rear();     // return 4
         */
        myCircularQueue = new MyCircularQueue(3);
        Assert.assertTrue(myCircularQueue.enQueue(1));
        Assert.assertTrue(myCircularQueue.enQueue(2));
        Assert.assertTrue(myCircularQueue.enQueue(3));
        Assert.assertFalse(myCircularQueue.enQueue(4));
        Assert.assertEquals(3, myCircularQueue.Rear());
        Assert.assertTrue(myCircularQueue.isFull());
        Assert.assertTrue(myCircularQueue.deQueue());
        System.out.println(myCircularQueue.toString());
        Assert.assertTrue(myCircularQueue.enQueue(4));
        System.out.println(myCircularQueue.toString());
        Assert.assertEquals(4, myCircularQueue.Rear());
    }

    @Test
    public void testMyCircularQueue2(){

        myCircularQueue = new MyCircularQueue(6);
        Assert.assertTrue(myCircularQueue.enQueue(6));
        Assert.assertEquals(6, myCircularQueue.Rear());
        Assert.assertEquals(6, myCircularQueue.Rear());
        Assert.assertFalse(myCircularQueue.isFull());
        Assert.assertTrue(myCircularQueue.deQueue());
        Assert.assertTrue(myCircularQueue.isEmpty());
    }

}
