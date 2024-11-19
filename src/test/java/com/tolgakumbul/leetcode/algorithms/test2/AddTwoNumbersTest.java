package com.tolgakumbul.leetcode.algorithms.test2;

import com.tolgakumbul.leetcode.algorithms.medium.question2.AddTwoNumbers;
import com.tolgakumbul.leetcode.algorithms.medium.question2.ListNode;
import org.junit.Before;
import org.junit.Test;

public class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers;

    @Before
    public void setUp() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    public void addTwoNumbersCase1(){
        ListNode l1 = new ListNode(2, new ListNode(4,new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6,new ListNode(4)));
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(result);
    }

    @Test
    public void addTwoNumbersCase2(){
        ListNode l1 = new ListNode(9, new ListNode(9,new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9,new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9,new ListNode(9, new ListNode(9))));
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(result);
    }

    @Test
    public void addTwoNumbersCase3(){
        ListNode l1 = new ListNode(9, new ListNode(9));
        ListNode l2 = new ListNode(9, new ListNode(9));
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(result);
    }


}
