package com.tolgakumbul.leetcode.algorithms.question1091;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given an n x n binary matrix grid, return the length of the shortest clear path in the matrix. If there is no clear path, return -1.
 * <p>
 * A clear path in a binary matrix is a path from the top-left cell (i.e., (0, 0)) to the bottom-right cell (i.e., (n - 1, n - 1)) such that:
 * <p>
 * All the visited cells of the path are 0.
 * All the adjacent cells of the path are 8-directionally connected (i.e., they are different and they share an edge or a corner).
 * The length of a clear path is the number of visited cells of this path.
 * <p>
 * Example 1:
 * <p>
 * Input: grid = [[0,1],[1,0]]
 * Output: 2
 * <p>
 * Example 2:
 * <p>
 * Input: grid = [[0,0,0],[1,1,0],[1,1,0]]
 * Output: 4
 * <p>
 * Example 3:
 * <p>
 * Input: grid = [[1,0,0],[1,1,0],[1,1,0]]
 * Output: -1
 * <p>
 * https://leetcode.com/problems/shortest-path-in-binary-matrix/
 */
@Component(value = "Question-1091")
public class ShortestPathInBinaryMatrix {

    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] != 0 || grid[n-1][n-1] != 0) {
            return -1;
        }
        /**
         * The coordinates we can go to
         */
        int[]dx = {-1,0,1};
        int[]dy = {-1,0,1};

        Queue<int[]> queue = new LinkedList<>();
        /**
         * Coordinate x, Coordinate y, Path
         */
        queue.add(new int[]{0,0,1});
        grid[0][0] = 1;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int path = current[2];
            if(x == n -1 && y == n -1){
                return path;
            }

            /**
             * Add every possible grid with a value of 0 that we can go to
             */
            for(int i = 0;i<3;i++){
                for(int j = 0;j<3;j++){
                    int newX = x + dx[i];
                    int newY = y + dy[j];
                    if (newX >= 0 && newX < n && newY >= 0 && newY < n && grid[newX][newY] == 0) {
                        queue.offer(new int[]{newX, newY, path + 1});
                        /**
                         * Change that grid value to 1 to mark as visited
                         */
                        grid[newX][newY] = 1;
                    }
                }
            }
        }

        return -1;

    }

}
