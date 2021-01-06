package basic_algorithm;

import java.util.Scanner;

public class Page33_Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        while (b <= a) {
            System.out.println("a보다 큰 값을 입력해주세요.");
            b = scan.nextInt();
            System.out.println("b : " + b);
        }

        System.out.println("b - a는 "+ (b - a) + "입니다.");
    }
}
