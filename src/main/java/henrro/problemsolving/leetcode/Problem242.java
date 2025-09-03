package henrro.problemsolving.leetcode;

/*
    Name: 242. Valid Anagram
    Link: https://leetcode.com/problems/valid-anagram/description/
*/
public class Problem242 {


    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count1[s.charAt(i) - 'a']++;
            count2[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "hombre";
        String t = "brehom";
        System.out.println(isAnagram(s, t));
    }

}
