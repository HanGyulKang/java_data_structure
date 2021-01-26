package Example;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int cnt = 0; // 나눗셈 횟수
        int idx = 0; // 소수를 담을 배열 index
        int[] prime = new int[500]; //소수를 담을 배열

        // 2는 소수이기때문에 넣고 시작
        prime[idx++] = 2;

        for (int i = 3; i <= 1000; i += 2) { // 홀수만 대상(2를 초과하는 짝수는 이미 소수가 아님)

            int j;
            for (j = 1; j < idx; j++) {
                cnt++;
                // 저장한 소수로 나누어지는 수가 있을 경우 break
                if(i % prime[j] == 0) {
                    break;
                }
            }

            // 위 조건의 break에 안 걸리면 for문을 빠져나올 때 j는 idx - 1과 같아지므로
            // 해당 idx에 소수가 아닌 i값을 집어넣는다.
            if(idx == j) {
                // 소수를 집어넣은 다음 index를 증가시킨다.
                prime[idx++] = i;
            }
        }

        // idx = 총 소수의 갯수
        for (int i = 0; i < idx; i++) {
            System.out.println(prime[i]);
        }
        // PrimeNumber1 클래스에서의 나눗셈을 수행한 횟수 : 78022
        // PrimeNumber2 클래스에서의 나눗셈을 수행한 횟수 : 14622
        System.out.println("나눗셈을 수행한 횟수 : " + cnt);
    }
}
