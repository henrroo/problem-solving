package solved;

import java.util.Scanner;

public class Problem282A {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int X = 0;
        int n = entrada.nextInt();
        if (n>=1 && n<=150) {
            String[] stmnts = new String[n];
            for (int i = 0; i < stmnts.length; i++) {
                stmnts[i] = entrada.next();
            }
            for (int i = 0; i < stmnts.length; i++) {
                if (stmnts[i].equals("X++") || stmnts[i].equals("++X")) {
                    X++;
                } else if (stmnts[i].equals("X--") || stmnts[i].equals("--X")) {
                    X--;
                }
            }
            System.out.println(X);
        }
    }
}
