package com.tolgakumbul.leetcode.algorithms.question21;

import com.tolgakumbul.leetcode.algorithms.question2.ListNode;
import org.springframework.stereotype.Component;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 * Example 1:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 *
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 *
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/description/">Q21</a>
 */
@Component(value = "Question-21")
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        if(list1 == null){
            return list2;
        } else if (list2 == null){
            return list1;
        }
        int max = Math.min(list1.val, list2.val);
        result.val = max;
        if(max == list1.val){
            result.next = mergeTwoLists(list1.next, list2);
        } else {
            result.next = mergeTwoLists(list1, list2.next);
        }
        return result;
    }
}
