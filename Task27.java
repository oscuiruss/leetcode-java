import java.util.Arrays;

public class Task27 {
    public static void main(String[] args) {
//        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums = new int[]{3, 2, 2, 3};
        System.out.println(removeElement(nums, 3));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int last = 0;
        for (int cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != val) {
                nums[last] = nums[cur];
                last++;
            }
        }
        return last;
    }
}
