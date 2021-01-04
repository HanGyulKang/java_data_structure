package basic_algorithm;

import java.util.Scanner;

public class Mid_01 {
    // 세 값 중 중앙값 구하기
    static int mid(int a, int b, int c) {
        int max = a;
        if(max < b) {
            max = b;
        }
        if(max < c) {
            max = c;
        }

        int min = a;
        if(min > b) {
            min = b;
        }
        if(min > c) {
            min = c;
        }

        int total = a + b + c;
        int mid = total - (max + min);

        return mid;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(mid(a,b,c));
    }

}
