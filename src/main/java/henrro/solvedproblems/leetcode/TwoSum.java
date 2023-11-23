package henrro.solvedproblems.leetcode;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] nums1 = {2, 5, 5, 11};
        int[] nums2 = {3, 2, 4};
        int target = 6;
        int[] result = twoSum(nums2, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean found = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        return result;
    }

}
