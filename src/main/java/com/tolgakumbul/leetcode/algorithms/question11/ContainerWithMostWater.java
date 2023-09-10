package com.tolgakumbul.leetcode.algorithms.question11;

import org.springframework.stereotype.Component;

/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 *
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 * In this case, the max area of water (blue section) the container can contain is 49.
 *
 * https://leetcode.com/problems/container-with-most-water/
 */
@Component(value = "Question-11")
public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int maxArea = 0;

        /* FIRST TRY */
        /*for(int i = 0; i<height.length-1; i++){
            for(int j = i+1; j<height.length; j++){
                int min = Math.min(height[i], height[j]);
                int diff = j-i;
                maxArea = Math.max(maxArea, (min * diff));
            }
        }*/

        /* SECOND TRY */
        /*firstLoop:
        for(int i = 0; i<height.length-1; i++){
            for(int j = height.length-1; j>0; j--){
                int min = Math.min(height[i], height[j]);
                int diff = j-i;
                maxArea = Math.max(maxArea, (min * diff));
                if(min == height[i]){
                    continue firstLoop;
                }
            }
        }*/

        /* FINAL */
        int pointer1 = 0, pointer2= height.length-1;
        while(pointer1 < pointer2){
            int min = Math.min(height[pointer1], height[pointer2]);
            int diff = pointer2-pointer1;
            maxArea = Math.max(maxArea, (min * diff));
            if(min == height[pointer1]){
                pointer1++;
            }else{
                pointer2--;
            }
        }

        return maxArea;
    }

}
