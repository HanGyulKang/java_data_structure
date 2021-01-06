package basic_algorithm;

import java.util.Scanner;

public class Sum_01 {
    static int sumof_02(int a, int b) {
        int sum = 0;
        int i = a;
        int j = b;

        while (i <= j) {
            sum += i;
            i++;
        }

        return sum;
    }

    static int sumof_01(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int res_01 = sumof_01(a,b);
        int res_02 = sumof_02(a,b);

        System.out.println(res_01);
        System.out.println(res_02);
    }

}
