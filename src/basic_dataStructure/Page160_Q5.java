package basic_dataStructure;

import example.IntQueue;

import java.util.Scanner;

public class Page160_Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IntQueue q = new IntQueue(64); // 최대 64개를 인큐할 수 있는 큐

        while(true) {
            System.out.println("\n현재 데이터 수 : " + q.size() + " / " + q.capacity());
            System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)값위치조회 (0)종료 : ");

            int menu = scan.nextInt();

            if(menu == 0) {
                break;
            }

            int x;
            switch(menu) {
                case 1 : // 인큐
                    System.out.print("데이터 입력 : ");
                    x = scan.nextInt();

                    try {
                        q.enque(x);
                    } catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }

                    break;
                case 2 : // 디큐
                    try {
                        x = q.deque();
                        System.out.println("디큐(꺼낸) 데이터는 : " + x + "입니다.");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비었습니다.");
                    }

                    break;
                case 3 : // 피크
                    try {
                        x = q.peek();
                        System.out.println("피크(다음 추출할 값 : front) 데이터는 : " + x + "입니다.");
                    } catch(IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비었습니다.");
                    }

                    break;
                case 4 : // 덤프
                    q.dump();

                    break;
                case 5 : // 값의 위치 조회
                    System.out.print("데이터 입력 : ");
                    x = scan.nextInt();

                    try {
                        int a = q.search(x);
                        System.out.println(">>>>>>>>> " + a);
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비었습니다.");
                    }

                    break;
                case 0 : // 종료
                    break;
            }
        }
    }
}
