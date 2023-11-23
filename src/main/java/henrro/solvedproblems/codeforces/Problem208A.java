package henrro.solvedproblems.codeforces;

import java.util.Scanner;

public class Problem208A {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dub = entrada.nextLine();
        StringBuilder lyrics = new StringBuilder();
        if (dub.contains("WUB")) {
            for (int i = 0; i < dub.length(); i++) {
                lyrics.append(dub.charAt(i));
                if (lyrics.toString().contains("WUB")) {
                    lyrics = new StringBuilder(lyrics.toString().replace("WUB", ""));
                    lyrics.append(" ");
                }
            }
        } else {
            System.out.println(dub);
        }
        System.out.println(lyrics.toString().trim());

    }
}
