package henrro.solvedproblems.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
    Name: 3375. Minimum Operations to Make Array Values Equal to K
    Link: https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k/description/
*/
public class Problem3375 {

    public int minOperations(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        if (nums[0] < k) return -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) count++;
        }
        if (nums[0] != k) count++;
        return count;
    }

    public int minOperations2(int[] nums, int k) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            if (num < k) return -1;
            numbers.add(num);
        }
        return (numbers.contains(k)) ? numbers.size() - 1 : numbers.size();
    }

    public static void main(String[] args) {
        Problem3375 instance = new Problem3375();
        int[] nums = new int[]{5, 2, 5, 4, 5};
        System.out.println(instance.minOperations2(nums, 2));
    }

}
