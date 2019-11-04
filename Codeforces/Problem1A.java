package solved;

import java.util.Scanner;

public class Problem1A {
    public static void main(String[] args) {
        long n, m, a;
        Scanner keyboard = new Scanner(System.in);
        n = keyboard.nextLong();
        m = keyboard.nextLong();
        a = keyboard.nextLong();
        System.out.println(((n+a-1)/a)*((m+a-1)/a));

    }
}
