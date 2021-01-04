package basic_algorithm;

import java.util.Scanner;

public class Max_01 {
    // 네 값 중 최댓값 구하기
    static int max4(int a, int b, int c, int d) {
        int max = a;

        if(b > max) {
            max = b;
        }

        if(c > max) {
            max = c;
        }

        if(d > max) {
            max = d;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        System.out.println(max4(a, b, c, d));
    }
}
