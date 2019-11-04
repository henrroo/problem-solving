package solved;

import java.util.Scanner;

public class Problem158A {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int k,n,c=0;
        int[] arr;
        n = entrada.nextInt();
        k = entrada.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = entrada.nextInt();
        }
        for (int value : arr) {
            if (value == 0) {
            } else if (value >= arr[k-1]) {
                c++;
            }
        }
        System.out.println(c);
    }
}
