package ArraysHashing;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Brian Qu
 * @version 1.0
 * @implSpec
 * @since 2024-08-27
 */
public class LC36_Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        // initialization, a HashSet to record the element seen in each row, col and block
        Set<String> seen = new HashSet<>();

        // iterate through the board cells
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // if cell is empty, skip
                if (board[i][j] == '.') {
                    continue;
                }
                // else, record the seen, if the element is seen in any of row, col or block, return false
                if (!seen.add("row" + i + board[i][j]) || !seen.add("col" + j + board[i][j]) || !seen.add("block" + i/3 + j/3 + board[i][j])) {
                    return false;
                }
            }
        }

        // no rules are broken
        return true;
    }
}
