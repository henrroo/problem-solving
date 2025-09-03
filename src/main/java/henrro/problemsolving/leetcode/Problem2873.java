package henrro.problemsolving.leetcode;

/*
    Name: 2873. Maximum Value of an Ordered Triplet I
    Link: https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/description/
*/
public class Problem2873 {

    public long maximumTripletValue(int[] nums) {

        long max = 0;
        long operation;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    operation = (long) (nums[i] - nums[j]) * nums[k];
                    if (operation > max) {
                        max = operation;
                    }
                    if (i == nums.length - 3 && j == nums.length - 2 && k == nums.length - 1) {
                        return max;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Problem2873 instance = new Problem2873();
        int[] nums = new int[]{8, 6, 3, 13, 2, 12, 19, 5, 19, 6, 10, 11, 9};
        System.out.println(instance.maximumTripletValue(nums));
    }

}
