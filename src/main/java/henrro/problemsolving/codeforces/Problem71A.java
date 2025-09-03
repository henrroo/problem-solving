package henrro.problemsolving.codeforces;

import java.util.Scanner;

public class Problem71A {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        String word[] = new String[n+1];


        for (int i = 0; i < word.length ; i++) {

            word[i] = keyboard.nextLine();
        }

        for (int i = 0; i < word.length ; i++) {
            if (word[i].length()<=10) {
                System.out.println(word[i]);
            } else {
                System.out.println(word[i].charAt(0)+""+(word[i].length()-2)+""+word[i].charAt(word[i].length()-1));
            }
        }


    }



}
