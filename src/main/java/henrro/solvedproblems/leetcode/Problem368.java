package henrro.solvedproblems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

/*
    Name: 368. Largest Divisible Subset
    Link: https://leetcode.com/problems/largest-divisible-subset/description/
*/
public class Problem368 {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int[] dp = new int[len];
        int[] prev = new int[len];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            prev[i] = -1;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        prev[i] = j;
                }
            }
        }

        int maxi = 0;
        int biggestValue = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > biggestValue) {
                biggestValue = dp[i];
                maxi = i;
            }
        }

//        System.out.println("Arrays.toString(dp) = " + Arrays.toString(dp));
//        System.out.println("Arrays.toString(prev) = " + Arrays.toString(prev));
//        System.out.println("maxi = " + maxi);
        List<Integer> res = new ArrayList<>();
        while (maxi != -1) {
            res.add(nums[maxi]);
            maxi = prev[maxi];
        }
        return res;
    }

    public static void main(String[] args) {
        Problem368 instance = new Problem368();
        int[] nums = new int[]{3,4,6,8,12,16,32};
        System.out.println(instance.largestDivisibleSubset(nums));
    }

}
