package henrro.solvedproblems.leetcode;

/*
    Name: 2843. Count Symmetric Integers
    Link: https://leetcode.com/problems/count-symmetric-integers/description/
*/
public class Problem2843 {

    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            String s = String.valueOf(i);
            if (s.length() % 2 == 0) {
                int sumLeft = 0;
                for (int j = 0; j < s.length() / 2; j++) {
                    sumLeft += s.charAt(j);
                }
                int sumRight = 0;
                for (int j = s.length() - 1; j >= s.length() / 2; j--) {
                    sumRight += s.charAt(j);
                }
                if (sumLeft == sumRight) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Problem2843 instance = new Problem2843();
        System.out.println(instance.countSymmetricIntegers(1, 100));
    }

}
