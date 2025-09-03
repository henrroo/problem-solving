package henrro.problemsolving.leetcode;

import java.util.*;

/*
    Name: 3396. Minimum Number of Operations to Make Elements in Array Distinct
    Link: https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/description/
*/
public class Problem3396 {

    public int minimumOperations(int[] nums) {

        if (nums.length == 0 || nums.length == 1) return 0;
        if (nums.length == 2) {
            return nums[0] == nums[1] ? 1 : 0;
        }
        if (nums.length == 3) {
            return nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2] ? 1 : 0;
        }

        Map<Integer, Integer> numCount = new HashMap<>();

        for (int num : nums) {
            numCount.merge(num, 1, Integer::sum);
        }

        int count = 0;
        for (int i = 0; i < nums.length - 2; i += 3) {
            if (areDistinct(numCount)) return count;
            numCount.merge(nums[i], -1, Integer::sum);
            numCount.merge(nums[i + 1], -1, Integer::sum);
            numCount.merge(nums[i + 2], -1, Integer::sum);
            count++;
            if (i == nums.length - 5) {
                if (nums[nums.length - 2] == nums[nums.length - 1]) count++;
                break;
            }
        }
        return count;
    }

    public boolean areDistinct(Map<Integer, Integer> map) {
        System.out.println("map = " + map);
        for (Integer key : map.keySet()) {
            if (map.get(key) > 1) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Problem3396 instance = new Problem3396();
        int[] nums = new int[]{15, 3, 5, 5};
        System.out.println(instance.minimumOperations(nums));
    }

}
