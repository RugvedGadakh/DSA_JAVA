class Backtracking { // Time Complexity (n*n!)

    public static void PrintPErmutations(String str, String Perm, int idx) {

        if (str.length() == 0) {
            System.out.println(Perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            PrintPErmutations(newStr, Perm + currChar, idx + 1);
        }

    }

    public static void main(String[] args) {

        String str = "ABC";
        PrintPErmutations(str, "", 0);
    }
}