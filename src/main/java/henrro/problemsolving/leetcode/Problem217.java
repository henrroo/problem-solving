package henrro.problemsolving.leetcode;

import java.util.HashSet;
import java.util.Set;

/*
    Name: 217. Contains Duplicate
    Link: https://leetcode.com/problems/contains-duplicate/description/
*/
public class Problem217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (!numSet.add(num)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Problem217 instance = new Problem217();
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(instance.containsDuplicate(nums));
    }

}
