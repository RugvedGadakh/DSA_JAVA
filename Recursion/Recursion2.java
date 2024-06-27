import java.util.HashSet;

public class Recursion2 {

    // Tower Of Hanoi
    public static void TowerOfHanoi(int n, String Src, String Helper, String Dest) {
        // Time Complexity (O(2^n))
        if (n == 1) {
            System.out.println("Transfer Disk " + n + " from Source " + Src + " to Destination " + Dest);
            return;
        }
        TowerOfHanoi(n - 1, Src, Dest, Helper);
        System.out.println("Transfer Disk " + n + " from Source " + Src + " to Destination " + Dest);
        TowerOfHanoi(n - 1, Helper, Src, Dest);
    }

    // String Reverse
    public static void StringRev(String str, int index) {
        // Time Complexity (O(n))
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index));
        StringRev(str, index - 1);
    }




    // First and last occurance
    public static int first = -1;
    public static int last = -1;

    public static void Occurance(String str, int index, char element) {
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        Occurance(str, index + 1, element);
    }

    // Check if array is sorted(Strictly increasing)

    public static boolean SortedInc(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] < arr[index + 1]) {
            return SortedInc(arr, index + 1);
        } else {
            return false;
        }
    }

    // Move All X

    public static void MoveAllX(String str, int index, int count, String NewStr) {
        // Time Complexity (O(n))

        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                NewStr += 'x';
            }
            System.out.println(NewStr);
            return;
        }

        char currChar = str.charAt(index);
        if (currChar == 'x') {
            count++;
            MoveAllX(str, index + 1, count, NewStr);
        } else {
            NewStr += currChar;
            MoveAllX(str, index + 1, count, NewStr);
        }

    }

    // Remove Duplicates
    public static boolean[] map = new boolean[26];
    // Time Complexity (O(n))

    public static void RemoveRepe(String str, int idx, String newStr) {

        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        if (map[currChar - 'a'] == true) {
            RemoveRepe(str, idx + 1, newStr);
        } else {
            newStr += currChar;
            map[currChar - 'a'] = true;
            RemoveRepe(str, idx + 1, newStr);

        }

    }

    // Subsequences :
    public static void Subsequences(String str, int index, String newStr) {
        // Time Complexity (O(2^n))
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);

        // to be
        Subsequences(str, index + 1, newStr + currChar);

        // not to be
        Subsequences(str, index + 1, newStr);
    }

    // UniqueSubsequences :
    public static void UniqueSubsequences(String str, int index, String newStr, HashSet<String> set) {
        // Time Complexity (O(2^n))
        if (index == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char currChar = str.charAt(index);

        // to be
        UniqueSubsequences(str, index + 1, newStr + currChar, set);

        // not to be
        UniqueSubsequences(str, index + 1, newStr, set);
    }

    // KeyPad Combinations :
    public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

    public static void KeypadComb(String str, int index, String Combination) {
        // Time Complexity (O(4^n))
        if (index == str.length()) {
            System.out.println(Combination);
            return;
        }

        char currChar = str.charAt(index);
        String Mapping = keypad[currChar - '0'];

        for (int i = 0; i < Mapping.length(); i++) {
            KeypadComb(str, index + 1, Combination + Mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Tower Of Hanoi : ");
        int n = 3;
        TowerOfHanoi(n, "S", "H", "D");
        System.out.println();

        System.out.println("String Reverse :");
        String str = "abcd";
        StringRev(str, str.length() - 1);

        System.out.println();

        System.out.println("First and last occurance :");
        String str2 = "bcaabababbsad";
        Occurance(str2, 0, 'a');

        System.out.println();

        System.out.println("Check if array is sorted(Strictly increasing) :");
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3, 4, 4 };
        int arr3[] = { 1, 2, 3, 8, 5 };

        System.out.println(SortedInc(arr1, 0));
        System.out.println(SortedInc(arr2, 0));
        System.out.println(SortedInc(arr3, 0));

        System.out.println();

        System.out.println("Move All X : ");
        String str3 = "axbcxxd";
        MoveAllX(str3, 0, 0, "");

        System.out.println();
        System.out.println("Remove Duplicates :");
        String str4 = "abcaadbcde";
        RemoveRepe(str4, 0, "");

        System.out.println();

        System.out.println("Subsequences :");
        String str5 = "abc";
        Subsequences(str5, 0, "");

        System.out.println();
        System.out.println("UniqueSubsequences : ");
        String str6 = "aaa";
        HashSet<String> set = new HashSet<>();
        UniqueSubsequences(str6, 0, "", set);
        System.out.println();

        System.out.println("KeyPad Combinations :");
        String str7 = "23";
        KeypadComb(str7, 0, "");
    }
}
