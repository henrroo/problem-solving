package henrro.solvedproblems.leetcode;

public class Problem1931 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int tank = 0;
        int startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];
            if (tank < 0) {
                startIndex = i + 1;
                tank = 0;
            }
        }

        if (totalCost > totalGas) {
            return -1;
        }

        return startIndex;
    }

    public static void main(String[] args) {
        Problem1931 instance = new Problem1931();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {2, 3, 4, 5, 1};
        System.out.println(instance.canCompleteCircuit(gas, cost)); // Output: 4
    }

}
