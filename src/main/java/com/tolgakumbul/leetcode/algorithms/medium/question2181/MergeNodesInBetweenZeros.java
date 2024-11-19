package com.tolgakumbul.leetcode.algorithms.medium.question2181;

import com.tolgakumbul.leetcode.algorithms.medium.question2.ListNode;
import org.springframework.stereotype.Component;

/**
 * You are given the head of a linked list, which contains a series of integers separated by 0's.
 * The beginning and end of the linked list will have Node.val == 0.
 *
 * For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes.
 * The modified list should not contain any 0's.
 *
 * Return the head of the modified linked list.
 *
 * Example 1:
 * Input: head = [0,3,1,0,4,5,2,0]
 * Output: [4,11]
 * Explanation:
 * The above figure represents the given linked list. The modified list contains
 * - The sum of the nodes marked in green: 3 + 1 = 4.
 * - The sum of the nodes marked in red: 4 + 5 + 2 = 11.
 *
 * Example 2:
 *
 * Input: head = [0,1,0,3,0,2,2,0]
 * Output: [1,3,4]
 * Explanation:
 * The above figure represents the given linked list. The modified list contains
 * - The sum of the nodes marked in green: 1 = 1.
 * - The sum of the nodes marked in red: 3 = 3.
 * - The sum of the nodes marked in yellow: 2 + 2 = 4.
 *
 * <a href="https://leetcode.com/problems/merge-nodes-in-between-zeros/description/">Q2181</a>
 */
@Component(value = "Question-2181")
public class MergeNodesInBetweenZeros {

    public ListNode mergeNodes(ListNode head) {
        head = head.next;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int val = 0;
        while (head != null) {
            if (head.val != 0) {
                val += head.val;
            } else {
                current.next = new ListNode(val);
                current = current.next;
                val = 0;
            }
            head = head.next;
        }
        return dummy.next;
    }

}
