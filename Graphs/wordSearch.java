/* 

Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, 
where adjacent cells are horizontally or vertically neighboring. 
The same letter cell may not be used more than once.

 

Example 1:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true


Example 2:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true


Example 3:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false

*/

package Graphs;

public class wordSearch {
    public static boolean search(int i, int j, String word, char[][] board, int index) {
        // Base case: the entire word is found
        if (index == word.length()) {
            return true;
        }

        // Check if the current cell is out of bounds or does not match the current character in the word
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        // Temporarily mark the current cell as visited
        char temp = board[i][j];
        board[i][j] = '#';

        // Recursively explore adjacent cells
        boolean res = search(i + 1, j, word, board, index + 1) || search(i, j + 1, word, board, index + 1)
                || search(i - 1, j, word, board, index + 1) || search(i, j - 1, word, board, index + 1);

        // Restore the original state of the current cell
        board[i][j] = temp;

        return res;
    }

    // Main method to check if the word exists on the board
    public static boolean exist(char[][] board, String word) {
        // Iterate through each cell in the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // If the current cell matches the first character of the word, initiate the search
                if (board[i][j] == word.charAt(0)) {
                    if (search(i, j, word, board, 0)) {
                        return true;
                    }
                }
            }
        }
        // If no match is found, return false
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
    };

    String word = "ABCCED";

    System.out.println(exist(board,word));
    }
}
