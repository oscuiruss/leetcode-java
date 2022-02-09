import java.util.Arrays;
import java.util.HashMap;

public class Task260new {
    // [1,2,1,3,2,5]
    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 2, 3, 4, 1};
        int[] ans = singleNumber(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor = xor ^ num;
        }
        xor = xor & (-xor);
        int f = 0;
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((xor & nums[i]) == 0) {
                f = f ^ nums[i];
            } else {
                s = s ^ nums[i];
            }
        }
        int[] ans = new int[2];
        ans[0] = f;
        ans[1] = s;
        return ans;
    }
}
