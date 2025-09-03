package henrro.problemsolving.codeforces;

import java.util.Scanner;

public class Problem118A {

    public static boolean isVowel(String a) {
        a = a.toUpperCase();
        return switch (a) {
            case "A", "E", "I", "O", "U", "Y" -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cad = entrada.nextLine();
        StringBuilder newcad = new StringBuilder();
        for (int i = 0; i < cad.length(); i++) {
            if (!isVowel(String.valueOf(cad.charAt(i)))) {
                newcad.append(".").append(String.valueOf(cad.charAt(i)).toLowerCase());
            }
        }
        System.out.println(newcad);
    }
}
