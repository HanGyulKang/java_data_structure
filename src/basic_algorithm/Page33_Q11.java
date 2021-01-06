package basic_algorithm;

import java.util.Scanner;

public class Page33_Q11 {
    static String 자릿수_구하기(int a) {
        int cnt = 0;
        int num = a;

        while(num != 0) {
            num = num / 10;
            cnt++;
        }

        String res = cnt + "자리 수입니다.";
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println(자릿수_구하기(a));
    }
}
