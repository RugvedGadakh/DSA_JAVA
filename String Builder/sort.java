import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] nums = { 6, 5, 8, 4, 2, 1, 3 };

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
