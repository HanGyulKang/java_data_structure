package basic_dataStructure;

import java.util.Scanner;

// ** 선형검색 : 보초법 **
// [기존 선형검색의 검사 비용]
//  1. 검색한 값을 찾지 못하고 배열 끝을 지남
//  2. 검색한 값을 찾음
// [보초법 적용]
//  1. 검색한 값을 찾지 못할 경우 배열 마지막에 넣은 보초를 찾기 때문에 위 검사 비용 중 1번 항목은 없어짐
//  (검사 비용 50% 절감)
public class SeqSearchSen {
    static int seqSearchSen(int[] a, int size, int key) {
        int i = 0;

        a[size] = key; // 보초를 추가

        while(true) {
            if(a[i] == key) { // 검색 성공
                break;
            }
            i++;
        }
        return i == size ? -1 : i;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] a = new int[size + 1]; // 보초를 두기 위해 배열 크기에 +1을 해 줌

        for (int i = 0; i < size; i++) {
            a[i] = scan.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = scan.nextInt();

        int res = seqSearchSen(a, size, key);

        if(res == -1) {
            System.out.println("검색한 값이 없습니다.");
        } else {
            System.out.println("검색한 값은 배열의 "+res+"번째에 있습니다.");
        }
    }
}
