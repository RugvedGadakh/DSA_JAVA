import java.util.*;

public class N_Queens {

    // Time Complexity = O(n**n)

    public boolean isSafe(int row, int col, char board[][]) {
        // horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // upper right
        r = row;
        for (int c = col; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower left
        r = row;
        for (int c = col; c >= 0 && r < board.length; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower right
        r = row;
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;

    }

    public void saveBoard(char board[][], List<List<String>> allBoard) {
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row.append('Q');
                } else {
                    row.append('.');
                }
            }
            newBoard.add(row.toString());
        }
        allBoard.add(newBoard);
    }

    public void helper(char board[][], List<List<String>> allBoard, int col) {
        if (col == board.length) {
            saveBoard(board, allBoard);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoard, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoard = new ArrayList<>();
        char board[][] = new char[n][n];
        helper(board, allBoard, 0);
        return allBoard;
    }

    public static void main(String[] args) {

        N_Queens nQueens = new N_Queens(); // Create an instance of the class
        int n = 4;
        List<List<String>> solutions = nQueens.solveNQueens(n);

        // Print or process the solutions as needed
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
        }

    }
}
