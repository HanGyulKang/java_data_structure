package basic_algorithm;

import java.util.Scanner;

public class Page40_Q15toQ17 {
    // 왼쪽 아래가 직각인 이등변 삼각형 출력
    static void Q15(int a) {
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        while(a < 0) {
            System.out.println("0보다 큰 수를 입력해주세요.");
            a = scan.nextInt();
        }
        Q15(a);
    }
}
