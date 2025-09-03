package henrro.problemsolving.leetcode;

/*
    Name: 1863. Sum of All Subset XOR Totals
    Link: https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/
*/
public class Problem1863 {

    public int subsetXORSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum |= num;
        }
        return sum << (nums.length - 1);
    }

    public static void main(String[] args) {
        Problem1863 instance = new Problem1863();
        int[] nums = new int[]{1, 3};
        System.out.println(instance.subsetXORSum(nums));
    }

}
