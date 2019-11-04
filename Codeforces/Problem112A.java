package solved;

import java.util.Scanner;

public class Problem112A {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = 0, b = 0;
        String s1 = entrada.nextLine().toLowerCase();
        String s2 = entrada.nextLine().toLowerCase();
        if (s1.equals(s2)) {
            System.out.println(0);
        } else if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i)!=s2.charAt(i)){
                    a += s1.charAt(i);
                    b += s2.charAt(i);
                    break;
                }
            }
            if (a > b) {
                System.out.println(1);
            } else if (a < b) {
                System.out.println(-1);
            }
        }
    }
}
