package henrro.solvedproblems.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    Name: 916. Word Subsets
    Link: https://leetcode.com/problems/word-subsets/description/
*/
public class Problem916 {

    public List<String> wordSubsets(String[] words1, String[] words2) {
        Map<String, Integer> lettersCount = new HashMap<>();
        for (String word : words2) {
            Map<String, Integer> actualLettersCount = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                String actualChar = String.valueOf(word.charAt(i));
                actualLettersCount.merge(actualChar, 1, Integer::sum);
            }
            for (Map.Entry<String, Integer> entry : actualLettersCount.entrySet()) {
                if (lettersCount.get(entry.getKey()) == null || entry.getValue() > lettersCount.get(entry.getKey())) {
                    lettersCount.put(entry.getKey(), entry.getValue());
                }
            }
        }
        Map<String, Integer> actualWordOccurrences = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (String word : words1) {
            for (int i = 0; i < word.length(); i++) {
                String actualChar = String.valueOf(word.charAt(i));
                actualWordOccurrences.merge(actualChar, 1, Integer::sum);
            }
            boolean isSubset = true;
            for (Map.Entry<String, Integer> entry : lettersCount.entrySet()) {
                if (actualWordOccurrences.get(entry.getKey()) == null || entry.getValue() > actualWordOccurrences.get(entry.getKey())) {
                    isSubset = false;
                    break;
                }
            }
            if (isSubset) {
                result.add(word);
            }
            actualWordOccurrences = new HashMap<>();
        }
        return result;
    }

    public static void main(String[] args) {
        Problem916 instance = new Problem916();
        String[] words1 = new String[]{"bcedecccdb","daeeddecbc","ecceededdc","edadadccea","ebacdedcea","eddabdacec","cddbecbeca","eeababedcc","bcaddcdbad","aeeeeabeea"};
        String[] words2 = new String[]{"cb","aae","ccc","ab","adc"};
        System.out.println(instance.wordSubsets(words1, words2));
    }

}
