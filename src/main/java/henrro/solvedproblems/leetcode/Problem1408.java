package henrro.solvedproblems.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
    Name: 1408. String Matching in an Array
    Link: https://leetcode.com/problems/string-matching-in-an-array/description/
*/
public class Problem1408 {

    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[i].contains(words[j]) && !result.contains(words[j])) {
                    result.add(words[j]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"blue","green","bu"};
        System.out.println(stringMatching(words));
    }

}
