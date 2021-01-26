package basic_dataStructure;

import example.IntStack;
import java.util.Scanner;

// int형 스택의 사용 예
public class Page144_Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IntStack stack = new IntStack(64); // 최대 64개를 푸시할 수 있는 스택

        while(true) {
            System.out.println("현재 데이터 수 : " + stack.size() + "/" + stack.capacity());
            System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)선형검색 (6)스택비우기 (7)isEmpty (8)isFull (0)종료 : ");

            int menu = scan.nextInt();
            if(menu == 0) {
                System.out.println("시스템을 종료합니다.");
                break;
            }

            int x;
            boolean flag;

            switch (menu) {
                case 1: // push
                    System.out.print("데이터 입력 : ");
                    x = scan.nextInt();

                    try {
                        stack.push(x);
                    }catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2 : // pop
                    try {
                        x = stack.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 3 : // 피크
                    try {
                        x = stack.peek();
                        System.out.println("피크(정상에 있는 데이터)한 데이터는 " + x + "입니다.");
                    } catch(IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 4 : // 덤프
                    stack.dump();
                    break;

                case 5 : // indexOf 꼭대기부터 바닥으로 선형검색
                    System.out.print("검색할 데이터 입력 : ");
                    x = scan.nextInt();

                    try {
                        int res = stack.indexOf(x);

                        if(res <= 0) { // 검색 실패
                            System.out.println("검색한 데이터가 스택에 없습니다.");
                        } else {
                            System.out.println("검색한 데이터는 스택의 " + (res + 1) + "번째에 위치합니다.");
                        }

                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 6 : // clear
                    stack.clear();
                    break;

                case 7 : // isEmpty
                    flag = stack.isEmpty();

                    if(flag) {
                        System.out.println("스택이 비어있습니다.");
                    } else {
                        System.out.println("스택이 비어있지 않습니다.");
                    }

                    break;

                case 8 : // isFull
                    flag = stack.isFull();

                    if(flag) {
                        System.out.println("스택이 가득 찼습니다.");
                    } else {
                        System.out.println("스택이 가득 차지 않았습니다.");
                    }

                    break;
            }
        }
    }
}
