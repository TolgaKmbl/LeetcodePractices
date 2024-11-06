package com.tolgakumbul.leetcode.algorithms.test21;

import com.tolgakumbul.leetcode.algorithms.question2.ListNode;
import com.tolgakumbul.leetcode.algorithms.question21.MergeTwoSortedLists;
import org.junit.Before;
import org.junit.Test;

public class MergeTwoSortedListsTest {

    private MergeTwoSortedLists mergeTwoSortedLists;

    @Before
    public void setUp() {
        mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    @Test
    public void testMergeTwoListsCase1(){
        ListNode l1 = new ListNode(1, new ListNode(2,new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3,new ListNode(4)));
        ListNode result = mergeTwoSortedLists.mergeTwoLists(l1, l2);
        //Expecrted result -> [1,1,2,3,4,4]
        System.out.println(result);
    }
}
