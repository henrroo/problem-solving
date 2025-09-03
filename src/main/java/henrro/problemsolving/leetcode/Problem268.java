package henrro.problemsolving.leetcode;

/*
    Name: 268. Missing Number
    Link: https://leetcode.com/problems/missing-number/description/
*/
public class Problem268 {

    public int missingNumber(int[] nums) {
        boolean[] exists = new boolean[nums.length + 1];
        for (int num : nums) {
            exists[num] = true;
        }
        for (int i = 0; i < exists.length; i++) {
            if (!exists[i]) return i;
        }
        return -1;
    }

    public static void main(String[] args) {

    }

}
