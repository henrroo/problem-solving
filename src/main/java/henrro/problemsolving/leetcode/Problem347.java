package henrro.problemsolving.leetcode;

import java.util.*;

/*
    Name: 347. Top K Frequent Elements
    Link: https://leetcode.com/problems/top-k-frequent-elements/description/
*/
public class Problem347 {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);
        }

        List<Integer> topKFrequent = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int longestListSize = Integer.MIN_VALUE;
            int longestKey = Integer.MIN_VALUE;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > longestListSize) {
                    longestListSize = entry.getValue();
                    longestKey = entry.getKey();
                }
            }
            topKFrequent.add(longestKey);
            map.remove(longestKey);
        }

        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = topKFrequent.get(i);
        }
        return array;
    }

    public static int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue)
        );

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.offer(entry);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = Objects.requireNonNull(heap.poll()).getKey();
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println("topKFrequent(nums, k) = " + Arrays.toString(topKFrequent2(nums, k)));
    }

}
