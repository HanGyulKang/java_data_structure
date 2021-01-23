package basic_dataStructure;

import java.util.Scanner;

public class SearchPT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int SIZE = scan.nextInt();
        int[] arr = new int[SIZE];

        // 배열에 값 담기
        for (int i = 0; i < SIZE; i++) {
            arr[i] = scan.nextInt();
        }

        // 정렬
        for (int i = 0; i < SIZE; i++) {
            for (int j = 1; j < i; j++) {
                int temp = 0;
                if(arr[i] > arr[j - 1]) {
                    temp = arr[i];
                    arr[i] = arr[j - 1];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i < SIZE; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
