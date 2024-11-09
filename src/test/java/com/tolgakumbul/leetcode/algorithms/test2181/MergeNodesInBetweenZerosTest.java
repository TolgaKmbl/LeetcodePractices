package com.tolgakumbul.leetcode.algorithms.test2181;

import com.tolgakumbul.leetcode.algorithms.question2.ListNode;
import com.tolgakumbul.leetcode.algorithms.question2181.MergeNodesInBetweenZeros;
import org.junit.Before;
import org.junit.Test;

public class MergeNodesInBetweenZerosTest {

    private MergeNodesInBetweenZeros betweenZeros;

    @Before
    public void setUp() {
        betweenZeros = new MergeNodesInBetweenZeros();
    }

    @Test
    public void testMergeTwoListsCase1() {
        ListNode node = new ListNode(0, new ListNode(3, new ListNode(1, new ListNode(0,
                new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(0))))))));
        ListNode result = betweenZeros.mergeNodes(node);
        //Expecrted result -> [4,11]
        System.out.println(result);
    }

    @Test
    public void testMergeTwoListsCase2() {
        ListNode node = new ListNode(0, new ListNode(1, new ListNode(0, new ListNode(3,
                new ListNode(0, new ListNode(2, new ListNode(2, new ListNode(0))))))));
        ListNode result = betweenZeros.mergeNodes(node);
        //Expecrted result -> [1,3,4]
        System.out.println(result);
    }

}
