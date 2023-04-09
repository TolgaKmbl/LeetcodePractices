package com.tolgakumbul.leetcode;

import com.tolgakumbul.leetcode.solutions.question226.InvertBinaryTree;
import com.tolgakumbul.leetcode.solutions.question226.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class InvertBinaryTreeTest {

    private InvertBinaryTree invertBinaryTree;

    @Before
    public void setUp() {
        invertBinaryTree = new InvertBinaryTree();
    }

    @Test
    public void testInvertTreeCase1() {
        /* Case 1 = [4,2,7,1,3,6,9] */
        TreeNode treeNodeLeftLeft = new TreeNode(1);
        TreeNode treeNodeLeftRight = new TreeNode(3);
        TreeNode treeNodeRightLeft = new TreeNode(6);
        TreeNode treeNodeRightRight = new TreeNode(9);
        TreeNode treeNodeLeft = new TreeNode(2, treeNodeLeftLeft, treeNodeLeftRight);
        TreeNode treeNodeRight = new TreeNode(7, treeNodeRightLeft, treeNodeRightRight);
        TreeNode treeNode = new TreeNode(4, treeNodeLeft, treeNodeRight);
        TreeNode invertedTree = invertBinaryTree.invertTree(treeNode);

        Assert.assertEquals(2, invertedTree.right.val);
        Assert.assertEquals(7, invertedTree.left.val);
        Assert.assertEquals(1, invertedTree.right.right.val);
        Assert.assertEquals(3, invertedTree.right.left.val);
        Assert.assertEquals(6, invertedTree.left.right.val);
        Assert.assertEquals(9, invertedTree.left.left.val);
    }

    @Test
    public void testInvertTreeCase2() {
        /* Case 2 = [2,1,3] */
        TreeNode treeNodeLeft = new TreeNode(1);
        TreeNode treeNodeRight = new TreeNode(3);
        TreeNode treeNode = new TreeNode(2, treeNodeLeft, treeNodeRight);
        TreeNode invertedTree = invertBinaryTree.invertTree(treeNode);

        Assert.assertEquals(1, invertedTree.right.val);
        Assert.assertEquals(3, invertedTree.left.val);
    }

}
