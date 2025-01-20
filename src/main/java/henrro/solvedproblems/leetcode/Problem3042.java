package henrro.solvedproblems.leetcode;

/*
    Name: 3042. Count Prefix and Suffix Pairs I
    Link: https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/description/
*/
public class Problem3042 {

    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j]) && j > i) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPrefixAndSuffix(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        return s2.startsWith(s1) && s2.endsWith(s1);
    }

    public static void main(String[] args) {
        Problem3042 instance = new Problem3042();
        String[] words = new String[]{"abab", "ab"};
        System.out.println(instance.countPrefixSuffixPairs(words));
    }

}
