package henrro.solvedproblems.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/*
    Name: 3169. Count Days Without Meetings
    Link: https://leetcode.com/problems/count-days-without-meetings/description/
*/
public class Problem3169 {

    public int countDays(int days, int[][] meetings) {
        int freeDays = 0, latestEnd = 0;

        // Sort meetings based on starting times
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];

            // Add current range of days without a meeting
            if (start > latestEnd + 1) {
                freeDays += start - latestEnd - 1;
            }

            // Update latest meeting end
            latestEnd = Math.max(latestEnd, end);
        }

        // Add all days after the last day of meetings
        freeDays += days - latestEnd;

        return freeDays;
    }

    public static void main(String[] args) {
        Problem3169 instance = new Problem3169();
        int days = 8;
        int[][] meetings = new int[][]{{3, 4}, {4, 8}, {2, 5}, {3, 8}};
        System.out.println(instance.countDays(days, meetings));
    }
}
