public class PatternProblem {
    public static void main(String[] args) {
        int round;
        for (round = 1; round <= 2; round++) {
            for (int first = 1; first < 4; first++) {
                for (int second = 1; second < 4; second++) {
                    if (round == 1) {
                        System.out.print(second + " ");
                        System.out.print(first + " ");
                    } else if (round == 2) {
                        System.out.print(first + " ");
                        System.out.print(second + " ");
                    }
                }
                System.out.println();

            }

        }

    }
}