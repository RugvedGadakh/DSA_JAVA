import java.util.Scanner;

public class TwoDArrays {
    public static void main(String args[]) {
        // 2DArrays

        // declaration of 2D Arrays :
        // type[][] arrayName = new type[rows][columns];

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre number of rows : ");
        int rows = sc.nextInt();

        System.out.print("Entre number of colums : ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // taking input
        System.out.println("Taking inputs for 2D array : ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("Printing Matrix : ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // Searching in 2D matrix :

        System.out.print("Entre number to be search : ");
        int target = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (target == numbers[i][j]) {
                    System.out.println("present at index : [" + i + "] [" + j + "]");
                }
            }
        }

    }
}
