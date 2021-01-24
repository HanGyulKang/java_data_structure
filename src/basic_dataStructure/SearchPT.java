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
            for (int j = 0; j < SIZE; j++) {
                if(j == SIZE - 1) {
                    break;
                }
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < SIZE; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}