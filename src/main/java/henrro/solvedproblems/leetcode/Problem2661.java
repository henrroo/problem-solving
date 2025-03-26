package henrro.solvedproblems.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
    Name: 2661. First Completely Painted Row or Column
    Link: https://leetcode.com/problems/first-completely-painted-row-or-column/description/
*/
public class Problem2661 {

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        // Map to store the index of each number in the arr
        Map<Integer, Integer> numToIndex = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            numToIndex.put(arr[i], i);
        }

        int result = Integer.MAX_VALUE;
        int numRows = mat.length;
        int numCols = mat[0].length;

        // Check for the earliest row to be completely painted
        for (int row = 0; row < numRows; row++) {
            // Tracks the greatest index in this row
            int lastElementIndex = Integer.MIN_VALUE;
            for (int col = 0; col < numCols; col++) {
                int indexVal = numToIndex.get(mat[row][col]);
                lastElementIndex = Math.max(lastElementIndex, indexVal);
            }
            // Update result with the minimum index where this row is fully painted
            result = Math.min(result, lastElementIndex);
        }

        // Check for the earliest column to be completely painted
        for (int col = 0; col < numCols; col++) {
            int lastElementIndex = Integer.MIN_VALUE;
            for (int row = 0; row < numRows; row++) {
                int indexVal = numToIndex.get(mat[row][col]);
                lastElementIndex = Math.max(lastElementIndex, indexVal);
            }
            // Update result with the minimum index where this column is fully painted
            result = Math.min(result, lastElementIndex);
        }

        return result;
    }

    public static void main(String[] args) {
        Problem2661 instance = new Problem2661();
        int[] arr = new int[]{1, 3, 4, 2};
        int[] arr2 = new int[]{2, 8, 7, 4, 1, 3, 5, 6, 9};
        int[][] mat = new int[][]{
                {1, 4},
                {2, 3}
        };
        int[][] mat2 = new int[][]{
                {3, 2, 5},
                {1, 4, 6},
                {8, 7, 9}};
        System.out.println(instance.firstCompleteIndex(arr2, mat2));
    }

}
