public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12, 14, 0, 0, 0, 15, 5, 6, 8 };

        int i = 0;
        int count = 0;
        int j = 0;

        while (i < nums.length) {
            if (nums[i] == 0) {
                count++;
                i++;
            } else {
                nums[j] = nums[i];
                j++;
                i++;
            }
        }

        int x = nums.length - 1;
        while (count != 0) {
            nums[x] = 0;
            x--;
            count--;

        }

        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
