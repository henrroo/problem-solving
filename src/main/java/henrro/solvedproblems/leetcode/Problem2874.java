package henrro.solvedproblems.leetcode;

/*
    Name: 2874. Maximum Value of an Ordered Triplet II
    Link: https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-ii/description/
*/
public class Problem2874 {

    public long maximumTripletValue(int[] nums) {

        int n = nums.length;
        int[] prefixArr = new int[n];
        int[] suffixArr = new int[n];

        long res = 0;

        for (int i = 1; i < n; i++) {
            prefixArr[i] = Math.max(nums[i - 1], prefixArr[i - 1]);
            suffixArr[n - 1 - i] = Math.max(nums[n - i], suffixArr[n - i]);
        }

        for (int j = 1; j < n - 1; j++) {
            res = Math.max(res, (long) (prefixArr[j] - nums[j]) * suffixArr[j]);
        }
        return res;
    }

    public static void main(String[] args) {
        Problem2874 instance = new Problem2874();
        int[] nums = new int[]{8, 6, 3, 13, 2, 12, 19, 5, 19, 6, 10, 11, 9};
        System.out.println(instance.maximumTripletValue(nums));
    }

}