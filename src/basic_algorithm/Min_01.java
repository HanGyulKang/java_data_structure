package basic_algorithm;

import java.util.Scanner;

public class Min_01 {
    // 세 값 중 최솟값 구하기
    static int min(int a, int b, int c) {
        int min = a;

        if(min > b) {
            min = b;
        }

        if(min > c) {
            min = c;
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(min(a,b,c));
    }
}
