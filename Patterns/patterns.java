public class patterns {
    public static void main(String[] args) {

        // 1] Solid Rectangle pattern

        System.out.println("Solid rectangle pattern : ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 2] Hollow Rectangle pattern

        System.out.println("Hollow rectangle pattern : ");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 5 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        // 3] Half Pyramid pattern

        System.out.println("Hollow rectangle pattern : ");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 4] Inverted Half Pyramid pattern

        System.out.println("Inverted half pyramid pattern : ");

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 5] Inverted Half Pyramid pattern (Rotated by 180 degree)

        System.out.println("Inverted half pyramid pattern (Rotated by 180 degree) : ");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // 6] Half Pyramid pattern with numbers

        System.out.println("Half Pyramid pattern with numbers : ");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // 7] Inverted Half Pyramid pattern with numbers

        System.out.println("Inverted Half Pyramid pattern with numbers : ");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // 8] Flyods triangle

        System.out.println("Flyods triangle : ");

        int n = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }

        // 9] 0-1 triangle

        System.out.println("0-1 triangle : ");

        int num = 1;

        System.out.println("Hollow rectangle pattern : ");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    num = 1;
                } else {
                    num = 0;
                }
                System.out.print(num);
            }

            System.out.println();
        }

        // 10] Butterfly Pattern

        System.out.println("Butterfly Pattern: ");

        int no = 4;

        // upper part
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (no - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // lower part
        for (int i = no; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (no - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 11] Solid Rhombus

        System.out.println("Solid Rhombus : ");

        int a = 5;

        for (int i = 1; i < a; i++) {
            for (int j = a; j >= (a - i); j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 12] number pyramid

        System.out.println("number pyramid : ");

        int b = 5;

        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= b - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

    }
}
