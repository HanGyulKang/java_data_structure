package basic_dataStructure;

public class PrimeNumber1 {
    public static void main(String[] args) {
        int cnt = 0;

        for (int i = 2; i <= 1000; i++) {
            int j;
            for (j = 2; j < i; j++) {
                cnt++;
                // i mod j의 값이 0 이면 i가 나누어지는 수가 있음
                // 위와 같을 경우 break
                System.out.println(i + " " + j);
                System.out.println(i % j);
                if(i % j == 0) {
                    break;
                }
            }

            if(i == j) {
                // break에 걸려버리면 for문을 벗어날 때 j++되는 것과 i가 같을 수가 없음
                // break에 안 걸리면 for문에서 j는 i - 1까지 돌고 나올 때 j++ 되기 때문에 i와 j가 같아짐
                System.out.println("결과 : " + "소수는 " + i + ", for문을 벗어난 j는 " + j);
                System.out.println("=========");
            }
        }

        System.out.println("나눗셈을 수행한 횟수 : " + cnt);
    }
}
