package basic_algorithm;

import java.util.Scanner;

public class Page40_Q15toQ17 {
    static void Q17(int a) {
        int cnt = 1;

        for (int i = 0; i < a; i++) {
            for (int j = a - 1; j >= 0; j--) {
                if(j <= i) {
                    System.out.print(cnt);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < i; j++) {
                System.out.print(cnt);
            }
            cnt++;
            System.out.println();
        }
    }

    static void Q16(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = a - 1; j >= 0; j--) {
                if(j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Q15_4(int a) {
        for (int i = a; i > 0; i--) {
            for (int j = 1; j <= a; j++) {
                if(j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void Q15_3(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if(j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void Q15_2(int a) {
        int cnt = a;

        for (int i = 0; i < cnt; i++, a--) {
            for (int j = 0; j < a ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Q15_1(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
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
        System.out.println("[왼쪽 아래가 직각인 이등변 삼각형 출력]");
        Q15_1(a);
        System.out.println("\n[왼쪽 위가 직각인 이등변 삼각형 출력]");
        Q15_2(a);
        System.out.println("\n[오른쪽 위가 직각인 이등변 삼각형 출력]");
        Q15_3(a);
        System.out.println("\n[오른쪽 아래가 직각인 이등변 삼각형 출력]");
        Q15_4(a);
        System.out.println("\n[피라미드]");
        Q16(a);
        System.out.println("\n[숫자 피라미드]");
        Q17(a);
    }
}
