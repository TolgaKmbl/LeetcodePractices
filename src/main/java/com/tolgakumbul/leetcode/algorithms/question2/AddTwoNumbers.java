package com.tolgakumbul.leetcode.algorithms.question2;

import org.springframework.stereotype.Component;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * https://leetcode.com/problems/add-two-numbers/
 */
@Component(value = "Question-2")
public class AddTwoNumbers {

    private boolean kalan = false;
    private ListNode result;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int res = l1.val + l2.val;

        if (result != null) {
            setLatest(result, res);
        } else {
            result = new ListNode(res);
        }

        if (l1.next != null || l2.next != null) {
            addTwoNumbers(l1.next == null ? new ListNode(0) : l1.next, l2.next == null ? new ListNode(0) : l2.next);
        } else {
            arrangeListNode(result);
        }



        return result;
    }

    private void setLatest(ListNode source, int res) {
        if (source.next != null) {
            setLatest(source.next, res);
        } else {
            source.next = new ListNode(res);
        }
    }

    private void arrangeListNode(ListNode listNode){
        if(!kalan && listNode.val > 9){
            listNode.val = listNode.val - 10;
            kalan = true;
        } else if (kalan) {
            if(listNode.val <9){
                listNode.val++;
                kalan = false;
            }else{
                listNode.val = listNode.val + 1 -10;
            }
        }

        if(listNode.next == null){
            if(kalan){
                listNode.next = new ListNode(1);

            }
        } else {
            arrangeListNode(listNode.next);
        }
    }

    

}
