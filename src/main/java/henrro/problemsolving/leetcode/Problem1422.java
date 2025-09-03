package henrro.problemsolving.leetcode;

/*
    Name: 1408. String Matching in an Array
    Link: https://leetcode.com/problems/string-matching-in-an-array/description/
*/
public class Problem1422 {
    public int maxScore(String s) {
        int max = Integer.MIN_VALUE;
        int sum;
        for (int i = 1; i < s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);
            sum = countNumber('0', left) + countNumber('1', right);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static int countNumber(char number, String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == number) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Problem1422 instance = new Problem1422();
        String s = "1111";
        System.out.println(instance.maxScore(s));
    }

}
