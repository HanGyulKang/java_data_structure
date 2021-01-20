package basic_dataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class Page117_Q5 {
    // 이진 검색으로 찾은 검색값이 두 개 이상일 경우 앞선 곳에 위치하는 값을 추출하기
    // * 이진 검색은 배열이 정렬되었을 때 유효하다
    static int binSearchX(int[] a, int n, int key) {
        int start = 0;
        int end = n - 1;

        int idx = 0;

        // 이진 검색
        do {
            int mid = (start + end) / 2;

            if(a[mid] == key) {
                idx = mid;
                break; // 값을 찾았을 경우 break로 멈춤
            } else if (a[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        } while(start <= end);

        // 검색값을 찾은 위치의 -1(바로 앞의 인덱스)부터 배열의 맨 앞까지 선형 검색
        int res = 0;
        for (int i = idx - 1; i >= 0; i--) {
            if(a[i] == key) {
                res = i;
            }
        }

        if(res != 0) {
            return res;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int[] a = {1,2,3,4,5,6,7,11,11,11,11,11,11,11,12,13,14,15,16,17};
        int n = a.length;

        int key = scan.nextInt();

        int res = binSearchX(a, n, key);

        if(res == -1) {
            System.out.println("찾은 값이 없습니다.");
        } else {
            System.out.println("결과는? " + res);
        }

        // Arrays.binarySearch를 사용한 이진
        try {
            System.out.println("검색한 값의 위치는? " + Arrays.binarySearch(a, key)
                    + ", 값은? " + a[Arrays.binarySearch(a, key)]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new Exception("찾은 값이 없습니다.");
        }
    }
}
