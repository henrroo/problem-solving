package solved;

import java.util.Scanner;

public class Problem231A {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int P, V, T;
        int c=0;

        for (int i = 0; i < n; i++) {
            do {
                P = keyboard.nextInt();
                V = keyboard.nextInt();
                T = keyboard.nextInt();
            } while (P>1 || V>1 || T>1);

            if ((P+V+T)>=2) {
                c++;
            }


        }

        System.out.println(c);
    }
}
