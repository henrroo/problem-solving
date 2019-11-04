package solved;

import java.util.Scanner;

public class Problem118A {

    public static boolean isVowel(String a){
        a = a.toUpperCase();
        switch (a) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "Y":
                return true;
            default: return false;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cad = entrada.nextLine();
        String newcad = "";
        for (int i = 0; i < cad.length(); i++) {
            if (!isVowel(String.valueOf(cad.charAt(i)))){
                newcad+="."+String.valueOf(cad.charAt(i)).toLowerCase();
            }
        }
        System.out.println(newcad);
    }
}
