package Sobes;

import java.util.Arrays;

public class Task88 {
    //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    //Output: [1,2,2,3,5,6]
    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        merge(nums1, 0, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int n, int[] nums2, int m) {
        int i = n - 1;
        int j = m - 1;
        int k = m + n - 1;

        while (i >= 0 || j >= 0) {
            if (i >= 0 && j >= 0 && nums1[i] <= nums2[j]) {
                nums1[k] = nums2[j];
                k--;
                j--;
            } else if (i >= 0 && j >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else if (i < 0) {
                while (j != -1) {
                    nums1[k--] = nums2[j--];
                }
            } else {
                return;
            }
        }
    }
}
