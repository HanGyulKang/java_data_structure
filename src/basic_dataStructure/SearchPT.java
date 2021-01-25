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
        System.out.println("숫자 입력 종료\n\n[ 정렬 끝] \n");

        for (int i = 0; i < SIZE; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int num = scan.nextInt();
        System.out.println("찾는 숫자 " + num + "의 위치는?");

        // 이진 검색 시작
        int front = 0;
        int back = SIZE - 1;
        int res = -1;

        while(front <= back) {
            int mid = (front + back) / 2; // 반복될 수록 front 또는 back의 값이 달라지므로 mid는 가변값

            if(num == arr[mid]) {
                res = mid;
                break;
            } else if(num < arr[mid]) {
                back = mid - 1;
            } else if(num > arr[mid]) {
                front = mid + 1;
            }
        }

        if (res < 0) {
            System.out.println("찾는 숫자가 없습니다.");
        } else {
            System.out.println(num + "의 위치는 " + res + "입니다.");
        }
    }
}
