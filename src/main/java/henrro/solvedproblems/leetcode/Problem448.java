package henrro.solvedproblems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Name: 448. Find All Numbers Disappeared in an Array
    Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
*/
public class Problem448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        boolean[] visited = new boolean[nums.length + 1];

        for (int num : nums) {
            visited[num] = true;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (!visited[i]) result.add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Problem448 instance = new Problem448();
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(instance.findDisappearedNumbers(nums));

    }

}
