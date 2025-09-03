package henrro.problemsolving.codeforces;

import java.util.Scanner;

public class Problem4A {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int k = entrada.nextInt();
        if (k == 2) {
            System.out.println("NO");
        } else if (k % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
