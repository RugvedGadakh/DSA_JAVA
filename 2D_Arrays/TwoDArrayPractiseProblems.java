import java.util.Scanner;

public class TwoDArrayPractiseProblems {
    public static void main(String arge[]) {

        // Q1.Print the spiral order matrix as output for a given matrix of numbers.

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre number of rows : ");
        int n = sc.nextInt();

        System.out.print("Entre number of colums : ");
        int m = sc.nextInt();

        int[][] numbers = new int[n][m];

        // taking input
        System.out.println("Taking inputs for 2D array : ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing spiral elements : ");

        int rowStart = 0;
        int rowEnd = n - 1;

        int colStart = 0;
        int colEnd = m - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {

            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(numbers[rowStart][col] + " ");
            }
            rowStart++;

            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(numbers[row][colEnd] + " ");
            }
            colEnd--;

            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(numbers[rowEnd][col] + " ");
            }
            rowEnd--;

            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(numbers[row][colStart] + " ");
            }
            colStart++;

            // System.out.println();
        }
    }
}
