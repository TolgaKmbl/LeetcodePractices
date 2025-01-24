package com.tolgakumbul.leetcode.algorithms.hard.question51;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
 *
 * Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
 *
 * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.
 *
 * Example 1:
 *
 * Input: n = 4
 * Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 * Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
 *
 * Example 2:
 *
 * Input: n = 1
 * Output: [["Q"]]
 *
 * <a href="https://leetcode.com/problems/n-queens/description/">...</a>
 */
@Component(value = "Question-51")
public class NQueen {
    private int n;
    private int[] board;
    private List<List<String>> solutions;

    public NQueen(int n) {
        this.n = n;
        this.board = new int[n];
        this.solutions = new ArrayList<>();
    }

    public List<List<String>> solve() {
        placeQueen(0);
        return solutions;
    }

    private void placeQueen(int row) {
        if (row == n) {
            solutions.add(generateSolution());
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col)) {
                board[row] = col; // Kraliçeyi yerleştir
                placeQueen(row + 1); // Sonraki satıra geç
                board[row] = -1; // Backtrack
            }
        }
    }

    private boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false; // Aynı sütun veya çaprazda tehdit var
            }
        }
        return true;
    }

    private List<String> generateSolution() {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder(".".repeat(n));
            row.setCharAt(board[i], 'Q');
            solution.add(row.toString());
        }
        return solution;
    }

    public static void main(String[] args) {
        int n = 8;
        NQueen nQueen = new NQueen(n);
        List<List<String>> solutions = nQueen.solve();

        System.out.println("Toplam Çözüm Sayısı: " + solutions.size());
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}


