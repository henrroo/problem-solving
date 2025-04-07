package henrro.solvedproblems.leetcode;

public class Problem416 {

    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int num : nums) total += num;
        if (total % 2 != 0) return false;

        int target = total / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {
        Problem416 instance = new Problem416();
        int[] nums = new int[]{1, 5, 11, 5};
        System.out.println(instance.canPartition(nums));
    }

}
