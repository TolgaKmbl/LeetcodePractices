package com.tolgakumbul.leetcode.algorithms.medium.question662;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Given the root of a binary tree, return the maximum width of the given tree.
 * <p>
 * The maximum width of a tree is the maximum width among all levels.
 * <p>
 * The width of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes),
 * where the null nodes between the end-nodes that would be present in a complete binary tree
 * extending down to that level are also counted into the length calculation.
 * <p>
 * It is guaranteed that the answer will in the range of a 32-bit signed integer.
 * https://leetcode.com/problems/maximum-width-of-binary-tree/
 */
@Component(value = "Question-662")
public class MaximumWidthofBinaryTree {

    private int maxWidth;
    Map<Integer, Integer> leftMostPosition;
    public int widthOfBinaryTree(TreeNode root) {
        maxWidth = 0;
        leftMostPosition = new HashMap<>();
        getWidth(root,0,0);
        return maxWidth;
    }

    private void getWidth(TreeNode root, Integer depth, Integer position){
        if(root == null) {
            return;
        }
        /* When the left nodes are done looping, this hashmap will not be updated */
        leftMostPosition.computeIfAbsent(depth, i -> position);
        maxWidth = Math.max(maxWidth, position-leftMostPosition.get(depth)+1);
        /* Trickle down to the leftmost node with position 0 */
        getWidth(root.left, depth+1, position*2);
        /* Trickle down to the rightmost node with position 2*i+1 */
        getWidth(root.right, depth+1, position*2+1);
    }

}
