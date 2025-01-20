package henrro.solvedproblems.leetcode;

/*
    Name: 2185. Counting Words With a Given Prefix
    Link: https://leetcode.com/problems/counting-words-with-a-given-prefix/description/
*/
public class Problem2185 {

    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Problem2185 instance = new Problem2185();
        String[] words = new String[]{"pay", "attention", "practice", "attend"};
        String pref = "at";
        System.out.println(instance.prefixCount(words, pref));
    }

}