import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {

        // Arrays
        // dataType[] arrayName = new dataType[arraySize];

        // method 1

        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 10;
        marks[2] = 45;

        System.out.println("marks at 0th index : " + marks[0]);
        System.out.println("marks at 1th index : " + marks[1]);
        System.out.println("marks at 2th index : " + marks[2]);

        System.out.println("printing marks array items : ");

        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }

        // method2

        System.out.println("printing sbjects : ");

        String Subjects[] = { "physics", "chemistry", "Maths" };

        for (int i = 0; i < 3; i++) {
            System.out.println(Subjects[i]);
        }

        // method3

        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Entre Size : ");
        size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("taking array inputs : ");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("printing numbers : ");

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // size of an array

        // size == numbers.length

        int lg = numbers.length;

        System.out.println("length of number array = " + lg);

        // linear search

        int arr[] = { 1, 4, 8, 5, 6, 3 };

        int target = 8; // print index in arr

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("number present at index : " + i);
                break;
            }
        }

    }
}
