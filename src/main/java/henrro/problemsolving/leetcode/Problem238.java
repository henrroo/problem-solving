package henrro.problemsolving.leetcode;

import java.util.Arrays;

/*
    Name: 238. Product of Array Except Self
    Link: https://leetcode.com/problems/product-of-array-except-self/description/
*/
public class Problem238 {

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        Arrays.fill(result, 1);

        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] *= left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        //                     0, 1, 2, 3
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println("productExceptSelf(nums) = " + Arrays.toString(productExceptSelf(nums)));
    }

}
