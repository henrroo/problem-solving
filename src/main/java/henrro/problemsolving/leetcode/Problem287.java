package henrro.problemsolving.leetcode;

/*
    Name: 287. Find the Duplicate Number
    Link: https://leetcode.com/problems/find-the-duplicate-number/
*/
public class Problem287 {

    public int findDuplicate(int[] nums) {
        boolean[] found = new boolean[nums.length + 1];
        for (int num : nums) {
            if (found[num]) return num;
            found[num] = true;
        }
        return 0;
    }

    public static void main(String[] args) {
        Problem287 instance = new Problem287();
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(instance.findDuplicate(nums));
    }

}
