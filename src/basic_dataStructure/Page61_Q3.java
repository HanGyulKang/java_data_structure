package basic_dataStructure;

import java.util.Scanner;

public class Page61_Q3 {
    static int sumOf(int[] a) {
        int total = 0;

        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println(sumOf(a));
    }

}
