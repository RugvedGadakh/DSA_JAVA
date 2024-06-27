import java.util.*;

public class introduction {

    // function

    public static void printMyName(String name) {
        System.out.println("Your name is : " + name);
        return;
    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        // output/print
        System.out.println("Hello World");

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");

        // variables
        int a = 10;
        int b = 25;
        int sum = a + b;
        int sub = b - a;

        System.out.println(sum);
        System.out.println(sub);

        // input

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre String : ");
        String name = sc.nextLine();

        System.out.println("entre integer : ");
        int n = sc.nextInt();

        System.out.println("entre float : ");
        float num = sc.nextFloat();

        System.out.println(name + " " + n + " " + num);

        // if else statement

        int age = 30;

        if (age > 18) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // operator

        int mul = a * b;
        int div = a / b;
        int mod = b % a;

        System.out.println("sum : " + sum);
        System.out.println("sub : " + sub);
        System.out.println("mul : " + mul);
        System.out.println("div : " + div);
        System.out.println("mod : " + mod);

        // switch case

        int choice;
        System.out.println("entre choice : ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("sum : " + sum);
                break;
            case 2:
                System.out.println("sub : " + sub);
                break;
            case 3:
                System.out.println("mul : " + mul);
                break;
            case 4:
                System.out.println("div : " + div);
                break;
            case 5:
                System.out.println("mod : " + mod);
                break;
        }

        // loops

        // for loop
        System.out.println("for loop");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // while loop
        System.out.println("while loop");
        int j = 1;
        while (j < 11) {
            System.out.println(j);
            j++;
        }

        // do while loop
        System.out.println("do while loop");

        int k = 1;

        do {
            System.out.println(k);
            k++;
        } while (k < 11);

        // function call

        Scanner pc = new Scanner(System.in);

        System.out.println("Entre String : ");

        String name2 = pc.nextLine();
        printMyName(name2);

        int num1 = 4;
        int num2 = 6;

        int summation = calculateSum(num1, num2);

        System.out.println("sum is : " + summation);

    }
}