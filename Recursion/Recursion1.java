public class Recursion1 {

    // Q1: Printing number 5 to 1 :
    public static void PrintNum(int n) {
        // base case
        if (n == 0) {
            return;
        }

        // statement
        System.out.print(n + " ");
        PrintNum(n - 1);
    }

    // Printing number 1 to 5 :
    public static void PrintNum2(int n) {
        // base case
        if (n == 6) {
            return;
        }

        // statement
        System.out.print(n + " ");
        PrintNum2(n + 1);
    }

    // sum of n natural numbers:
    public static void SumOfNumbers(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        SumOfNumbers(i + 1, n, sum);
    }

    // Factorial of n natural numbers
    public static int FactorialOfNumbers(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = FactorialOfNumbers(n - 1);
        int fact = n * fact_nm1;
        return fact;
    }

    // Fibonacci series till nth term :

    public static void FibonacciSeries(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(" " + c);

        FibonacciSeries(b, c, n - 1);
    }

    // Print x^n (Stack Height = n) :

    public static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int iteration = Power(x, n - 1);
        int pow = x * iteration;
        return pow;
    }

    // Print x^n (Stack Height = logn):

    public static int Power2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        // for n is even
        if (n % 2 == 0) {
            return Power2(x, n / 2) * Power2(x, n / 2);
        } else {
            return Power2(x, n / 2) * Power2(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {

        System.out.println("Printing number 5 to 1 :");
        int n = 5;
        PrintNum(n);

        System.out.println();
        System.out.println();

        System.out.println("Printing number 1 to 5 :");
        int m = 1;
        PrintNum2(m);

        System.out.println();
        System.out.println();

        System.out.println("sum of n numbers :");
        SumOfNumbers(1, 5, 0);

        System.out.println();
        System.out.println();

        System.out.println("Factorial of n natural numbers:");
        int ans = FactorialOfNumbers(5);
        System.out.println(ans);

        System.out.println();
        System.out.println();

        System.out.println("Fibonacci series till nth term :");

        int a = 0;
        int b = 1;
        System.out.print(a);
        System.out.print(" " + b);

        FibonacciSeries(a, b, 7);

        System.out.println();
        System.out.println();

        System.out.println("Print x^n (Stack Height = n) :");

        int power = Power(4, 3);
        System.out.println(power);

        System.out.println();
        System.out.println();

        System.out.println("Print x^n (Stack Height = logn):");

        int power2 = Power2(4, 3);
        System.out.println(power2);

    }

}
