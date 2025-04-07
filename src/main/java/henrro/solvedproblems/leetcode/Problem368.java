package henrro.solvedproblems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Name: 368. Largest Divisible Subset
    Link: https://leetcode.com/problems/largest-divisible-subset/description/
*/
public class Problem368 {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> allSubsets = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), allSubsets);
        System.out.println("allSubsets = " + allSubsets);
        List<Integer> largestDivisibleSubset = new ArrayList<>();
        for (List<Integer> subset : allSubsets) {
            int subSetSize = 0;
            int backWardsSubsetSize = 0;
            for (int i = 0; i < subset.size() - 1; i++) {
                if (subset.get(i) % subset.get(i + 1) == 0) {
                    subSetSize++;
                }
            }
            for (int i = subset.size() - 1; i > 0; i--) {
                if (subset.get(i) % subset.get(i - 1) == 0) {
                    backWardsSubsetSize++;
                }
            }
            System.out.println("subset = " + subset);
            System.out.println("subSetSize = " + subSetSize);
            System.out.println("backWardsSubsetSize = " + backWardsSubsetSize);
            if (backWardsSubsetSize >  largestDivisibleSubset.size() || subSetSize > largestDivisibleSubset.size()) {
                if (backWardsSubsetSize >= subset.size() - 1 || subSetSize >= subset.size() - 1)
                    largestDivisibleSubset = subset;
            }
        }
        if (largestDivisibleSubset.isEmpty()) largestDivisibleSubset.add(nums[0]);
        return largestDivisibleSubset;
    }

//    Dynamic Programming solution using dp and prev array
//    public List<Integer> largestDivisibleSubset(int[] nums) {
//        Arrays.sort(nums);
//        int[] dp = new int[nums.length];
//        int[] prev = new int[nums.length];
//        Arrays.fill(dp, 1);
//        Arrays.fill(prev, -1);
//        int maxi = 0;
//        for (int i = 1; i < nums.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
//                    dp[i] = dp[j] + 1;
//                    prev[i] = j;
//                }
//            }
//            if (dp[i] > dp[maxi]) maxi = i;
//        }
//        List<Integer> res = new ArrayList<>();
//        for (int i = maxi; i >= 0; i = prev[i]) {
//            res.add(nums[i]);
//        }
//        return res;
//    }

    private void generateSubsets(int[] nums, int index, List<Integer> subset, List<List<Integer>> subsets) {
        if (index == nums.length) {
            subsets.add(new ArrayList<>(subset));
            return;
        }
        //Generate subsets adding nums[index]
        subset.add(nums[index]);
        generateSubsets(nums, index + 1, subset, subsets);

        //Generate subsets without nums[index]
        subset.removeLast();
        generateSubsets(nums, index + 1, subset, subsets);
    }

    public static void main(String[] args) {
        Problem368 instance = new Problem368();
        int[] nums = new int[]{2, 3, 8, 9, 27};
        System.out.println(instance.largestDivisibleSubset(nums));
    }

}
