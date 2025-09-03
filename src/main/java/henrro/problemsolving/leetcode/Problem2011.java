package henrro.problemsolving.leetcode;

/*
    Name: 2011. Final Value of Variable After Performing Operations
    Link: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
*/
public class Problem2011 {

    public int finalValueAfterOperations(String[] operations) {
        int res = 0;

        for (String operation : operations) {
            if (operation.charAt(1) == '+') res++;
            else res--;
        }

        return res;
    }

    public static void main(String[] args) {
        Problem2011 instance = new Problem2011();
        String[] operations = new String[]{"--X","X++","X++"};
        System.out.println(instance.finalValueAfterOperations(operations));

    }

}
