import java.util.Scanner;

public class ArraysPractiseProblems {
    public static void main(String args[]) {

        // Q1. Take an array of names as input from the user and print them on the
        // screen.

        System.out.println();

        System.out.println("Entre Size");
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();

        String arr[] = new String[size];

        System.out.println("Taking Input names : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
        }

        System.out.println("Printing out the names : ");

        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }

        System.out.println();

        // Q2. Find the maximum & minimum number in an array of integers.

        System.out.println();
        System.out.println("Entre Size");
        int len;
        len = sc.nextInt();

        int num[] = new int[len];

        System.out.println("Taking Input numbers : ");

        for (int i = 0; i < len; i++) {
            num[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println("maximum is : " + max);
        System.out.println("minimum is : " + min);

        System.out.println();

        // Q3.Take an array of numbers as input and check if it is an array sorted in
        // ascending order.
        // Eg : { 1, 2, 4, 7 } is sorted in ascending order.
        // {3, 4, 6, 2} is not sorted in ascending order.

        System.out.println("Entre Size");
        int len1;
        len1 = sc.nextInt();

        int num1[] = new int[len1];

        System.out.println("Taking Input numbers : ");

        for (int i = 0; i < len1; i++) {
            num1[i] = sc.nextInt();
        }

        int flag = 0;

        for (int i = 0; i < (len1 - 1); i++) {
            if (num1[i] < num1[i + 1]) {
                flag = 1;
            } else {
                flag = 0;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("The array is Sorted");
        } else {
            System.out.println("Array is not sorted");
        }

    }
}
