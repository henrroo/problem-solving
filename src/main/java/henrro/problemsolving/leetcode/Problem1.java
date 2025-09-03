package henrro.problemsolving.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
    Name: 1. Two Sum
    Link: https://leetcode.com/problems/two-sum/description/
*/
public class Problem1 {

    public static void main(String[] args) {
        int[] nums = {3, 3};
        int[] nums1 = {2, 5, 5, 11};
        int[] nums2 = {3, 2, 4};
        int target = 6;
        int[] result = twoSumAgainOptimizedSolvedByMe(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSumAgainOptimizedSolvedByMe(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static int[] twoSumAgain(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
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

    public int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numMap.containsKey(diff)) {
                result[0] = numMap.get(diff);
                result[1] = i;
                return result;
            }
            numMap.put(nums[i], i);
        }
        return result;
    }
}
