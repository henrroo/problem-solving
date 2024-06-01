package henrro.solvedproblems.hackerrank;

import java.util.*;

public class EqualizeTheArray {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
        System.out.println(equalizeArray(lista));
    }

    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        arr.forEach(i -> {
                    if (map.containsKey(i)) {
                        map.put(i, map.get(i) + 1);
                    } else {
                        map.put(i, 1);
                    }
                }
        );
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return arr.size() - max;
    }

}
