package com.tolgakumbul.leetcode.algorithms.test662;

import com.tolgakumbul.leetcode.algorithms.question662.TreeNode;
import com.tolgakumbul.leetcode.algorithms.question662.MaximumWidthofBinaryTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumWidthofBinaryTreeTest {

    private MaximumWidthofBinaryTree maximumWidthofBinaryTree;

    @Before
    public void setUp() {
        maximumWidthofBinaryTree = new MaximumWidthofBinaryTree();
    }

    @Test
    public void testWidthOfBinaryTree(){
        /* Case [1,3,2,5,3,null,9] */
        TreeNode treeNodeLeftLeft = new TreeNode(5);
        TreeNode treeNodeLeftRight = new TreeNode(3);
        TreeNode treeNodeRightLeft = null;
        TreeNode treeNodeRightRight = new TreeNode(9);
        TreeNode treeNodeLeft = new TreeNode(3, treeNodeLeftLeft, treeNodeLeftRight);
        TreeNode treeNodeRight = new TreeNode(2, treeNodeRightLeft, treeNodeRightRight);
        TreeNode treeNode = new TreeNode(1, treeNodeLeft, treeNodeRight);

        int width = maximumWidthofBinaryTree.widthOfBinaryTree(treeNode);
        Assert.assertEquals(4, width);

    }

    @Test
    public void testWidthOfBinaryTreeCase2(){
        /* Case [1,3,2,5,null,null,9,6,null,7] */
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(2);
        treeNode.left.left = new TreeNode(5);
        treeNode.right.right = new TreeNode(9);
        treeNode.right.right.left = new TreeNode(7);
        treeNode.left.left.left = new TreeNode(6);

        int width = maximumWidthofBinaryTree.widthOfBinaryTree(treeNode);
        Assert.assertEquals(7, width);

    }


}
