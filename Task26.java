import java.util.Arrays;

public class Task26 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int last = 0;
        for (int cur = 1; cur < nums.length; cur++) {
            if (nums[cur] != nums[cur - 1]) {
                nums[last + 1] = nums[cur];
                last++;
            }
        }
        return last + 1;
    }
}
