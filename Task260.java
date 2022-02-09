import java.util.HashMap;
import java.util.HashSet;
import java.util.*;
import java.io.*;

public class Task260 {
    // [1,2,1,3,2,5]
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 3, 2, 5};
        int[] ans = singleNumber(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, 2);
            }
        }
        int[] ans = new int[2];
        int c = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                ans[c] = key;
                c++;
            }
        }
        return ans;
    }
}
