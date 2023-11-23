package henrro.solvedproblems.codeforces;

import java.util.Scanner;

public class Problem50A {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m, n, x;
        m = entrada.nextInt();
        n = entrada.nextInt();
        if (m <= 16 && m >= 1 && n <= 16 && n >= 1) {
            x = m * n;
            System.out.println(x / 2);
        }
    }
}
