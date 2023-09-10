package com.tolgakumbul.leetcode.algorithms.question226;

import org.springframework.stereotype.Component;

/**
 * Given the root of a binary tree, invert the tree, and return its root.
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 * Case 1 = [4,2,7,1,3,6,9]
 * Case 2 = [2,1,3]
 * Case 3 = []
 * Case 4 = [2,3,null,1]
 * https://leetcode.com/problems/invert-binary-tree/
 */
@Component(value = "Question-226")
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        if(root.right != null || root.left != null) {
            invertTree(root.right);
            invertTree(root.left);
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        return root;
    }

}
