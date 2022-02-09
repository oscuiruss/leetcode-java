import java.util.Arrays;

public class Task283 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 2, 2, 3};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int last = 0;
        for (int cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                nums[last] = nums[cur];
                last++;
            }
        }
        for (int i = last; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
