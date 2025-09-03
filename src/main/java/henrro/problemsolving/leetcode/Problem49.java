package henrro.problemsolving.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    Name: 49. Group Anagrams
    Link: https://leetcode.com/problems/group-anagrams/description/

*/
public class Problem49 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];

            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int num : count) {
                sb.append(num);
            }

            String key = sb.toString();

            map.computeIfAbsent(key, _ -> new ArrayList<>()).add(str);
        }

        return map.values().stream().toList();
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("groupedAnagrams = " + groupAnagrams(strs));
    }
}
