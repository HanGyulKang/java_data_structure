package basic_dataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class Page121_Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scan.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요");

        System.out.print("x[0]: ");
        x[0] = scan.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = scan.nextInt();
            }while(x[i] < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력
        }

        System.out.print("검색할 값 : ");
        int key = scan.nextInt();

        int idx = Arrays.binarySearch(x, key);

        if(idx < 0) {
            System.out.println("삽입포인트 : " + idx);
        } else {
            System.out.println(key + "는 x[" + idx + "]에 있습니다.");
        }
    }
}
