public class SudokuSlver {

    public boolean helper(char board[][], int col, int row) {

        if (row == board.length - 1) {
            return true;
        }

        int nrow = 0;
        int ncol = 0;

        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if (board[row][col] != '.') {
            if (helper(board, ncol, nrow)) {
                return true;
            }
        } else {
            for (int num = 1; num <= 9; ++num) {
                if (isValid(board, col, row, num)) {
                    board[row][col] = (char) (num + '0');
                    if (helper(board, ncol, nrow)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
