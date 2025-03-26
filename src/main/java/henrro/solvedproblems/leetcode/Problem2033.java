package henrro.solvedproblems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
    Name: 2033. Minimum Operations to Make a Uni-Value Grid
    Link: https://leetcode.com/problems/minimum-operations-to-make-a-uni-value-grid/description/
*/
public class Problem2033 {

    public int minOperations(int[][] grid, int x) {

        for (int[] array : grid) {
            for (Integer number : array) {
                if (number % x != grid[0][0] % x) {
                    return -1;
                }
            }
        }

        List<Integer> sortedList = new ArrayList<>();

        for (int[] array : grid) {
            for (Integer number : array) {
                sortedList.add(number);
            }
        }

        sortedList.sort(Comparator.naturalOrder());

        int referenceNumber = sortedList.get(sortedList.size() / 2);
        int minOps = 0;

        for (Integer number : sortedList) {
            if (number < referenceNumber) {
                while (number != referenceNumber) {
                    number += x;
                    minOps++;
                }
            }
            if (number > referenceNumber) {
                while (number != referenceNumber) {
                    number -= x;
                    minOps++;
                }
            }
        }

        return minOps;
    }

    public static void main(String[] args) {
        Problem2033 instance = new Problem2033();

//        int[][] grid = {{2, 4}, {6, 8}};
//        int x = 2;

        int[][] grid = {{1, 5}, {2, 3}};
        int x = 1;

        System.out.println(instance.minOperations(grid, x));
    }
}
