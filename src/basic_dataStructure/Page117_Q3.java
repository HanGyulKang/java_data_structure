package basic_dataStructure;

import java.util.Scanner;

public class Page117_Q3 {
    // 요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로
    // 저장하고, 일치한 요솟수를 반환하는 메서드를 작성하시오.
    // 예를들어 요솟수가 8인 배열 a의 요소가 {1,9,2,9,4,6,7,9}이고 key가 9면 배열 idx에
    // {1,3,7}을 저장하고 3을 반환합니다.

    // 이진검색 답
    static int 이진검색(int[] a, int n, int key, int[] idx) {

        return 0;
    }


    // 선형검색 답
    static int 선형검색(int[] a, int n, int key, int[] idx) {
        int cnt = 0;

        int idxCnt = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] == key) {
                cnt++;
                a[idxCnt++] = i;
            }
        }

        if(cnt == 0) {
            return - 1; // 검색된 값이 없을 경우 -1 return
        } else {
            // 검색한 값의 배열 idx 구하기
            idx = new int[cnt];

            for (int i = 0; i < cnt; i++) {
                idx[i] = a[i];
                System.out.print(idx[i] + " ");
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = {1,9,2,9,4,6,7,9};
        int n = a.length;

        int key = scan.nextInt();
        int[] idx = {};

        // 선형검색 메소드 호출
        int res1 = 선형검색(a, n, key, idx);

        if(res1 == -1) {
            System.out.println("\n검색한 값이 없습니다.");
        } else {
            System.out.println("\n(선형 검색)검색한 값의 갯수는 : " + res1);
        }



        // 이진검색 메소드 호출
        int res2 = 이진검색(a, n, key, idx);

        if(res1 == -1) {
            System.out.println("\n검색한 값이 없습니다.");
        } else {
            System.out.println("\n(이진 검색)검색한 값의 갯수는 : " + res2);
        }

    }
}
