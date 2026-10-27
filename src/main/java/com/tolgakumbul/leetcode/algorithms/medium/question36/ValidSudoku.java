package com.tolgakumbul.leetcode.algorithms.medium.question36;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * GDetermine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 *
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 *
 * Example 1:
 *
 * Input: board =
 * [["5","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: true
 *
 * Example 2:
 *
 * Input: board =
 * [["8","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: false
 * Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 *
 * <a href="https://leetcode.com/problems/valid-sudoku/description/">...</a>
 */
@Component(value = "Question-36")
public class ValidSudoku {

    /**
     * char[][] board = {
     *     {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
     *     {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
     *     {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
     *     {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
     *     {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
     *     {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
     *     {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
     *     {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
     *     {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
     * };
     */

    public boolean isValidSudoku(char[][] board) {
        /**
         * TODO: Kullanılacak alanlar
         * Set 1 --> Row bazlı set, her satırda reset
         * Set 2,3,4 --> 3x3 bazlı set. 3 satırda bir reset
         * Set 5 --> Column bazlı set, resetlenmez.
         */

        /**
         * TODO: Duplike "." nesnelerinin handle'ı
         * Devamlı azalan negatif bir değer tutularak asıl değer nokta ise set'e eklenir
         */

        /**
         * TODO: Kontrol
         * Her set reset'lenmeden önce olması gereken size değeri ile kıyaslanır
         * Eşitlik tutmazsa false dönülür, tutarsa devam edilir
         */

        Set<String> rowBasedSet = new LinkedHashSet<>();
        Set<String> squareBasedSet1 = new LinkedHashSet<>();
        Set<String> squareBasedSet2 = new LinkedHashSet<>();
        Set<String> squareBasedSet3 = new LinkedHashSet<>();

        Set<String>[] colBasedSet = new HashSet[9];
        for (int i = 0; i < colBasedSet.length; i++) {
            colBasedSet[i] = new HashSet<>();
        }

        int negativePlaceholder = -1;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                String value = String.valueOf(board[i][j]);
                if(value.equals(".")){
                    value = String.valueOf(negativePlaceholder);
                    negativePlaceholder--;
                }

                if(j < 3){
                    squareBasedSet1.add(value);
                } else if(j < 6){
                    squareBasedSet2.add(value);
                } else {
                    squareBasedSet3.add(value);
                }
                rowBasedSet.add(value);

                colBasedSet[j].add(value);
            }

            System.out.println("Row based set: " + rowBasedSet);
            if(rowBasedSet.size() != 9){
                System.out.println("ROW SET KAYNAKLI BİTİRİLİYOR FALSE");
                return false;
            }
            rowBasedSet.clear();

            if(isSquare(i)){

                System.out.println("Square based set1: " + squareBasedSet1 + " size: " + squareBasedSet1.size());
                System.out.println("Square based set2: " + squareBasedSet2 + " size: " + squareBasedSet2.size());
                System.out.println("Square based set3: " + squareBasedSet2 + " size: " + squareBasedSet3.size());

                if(squareBasedSet1.size() != 9 || squareBasedSet2.size() != 9 || squareBasedSet3.size() != 9){
                    System.out.println("SQUARE SET KAYNAKLI BİTİRİLİYOR FALSE");
                    return false;
                }
                squareBasedSet1.clear();
                squareBasedSet2.clear();
                squareBasedSet3.clear();
            }
        }


        for (int i = 0; i < colBasedSet.length; i++) {
            Set<String> set = colBasedSet[i];
            System.out.println("Square based set #" + (i + 1) + " " + set + " size: " + set.size());
            if (set.size() != 9) {
                System.out.println("COLUMN SET KAYNAKLI BİTİRİLİYOR FALSE");
                return false;
            }
        }

        return true;
    }

    private boolean isSquare(int i){
        return (i +1) % 3 == 0;
    }
}
