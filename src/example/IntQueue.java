package example;

// int형 큐
public class IntQueue {
    private int max; // 큐의 용량
    private int front; // 첫 번째 요소 커서
    private int rear; // 마지막 요소 커서
    private int num; //현재 데이터 수
    private int[] que; // 큐 본체

    // 실행 시 예외 : 큐가 비어있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }

    // 실행 시 예외 : 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    // 생성자
    public IntQueue(int capacity) {
        num = front = rear = 0; // 큐 생성시 큐는 비어있는 상태이기 때문에 num, front, rear 모두 0으로 초기화
        max = capacity; // que의 용량

        try {
            que = new int[max]; // 큐 본체용 배열을 생성
        } catch (OutOfMemoryError e) { // 생성할 수 없음
            max = 0;
        }
    }

    // 큐에 데이터를 인큐
    public int enque(int x) throws OverflowIntQueueException {
        if(num >= max) {
            throw new OverflowIntQueueException(); // 큐가 가득 참
        }

        que[rear++] = x; // que에 값 입력 후 rear를 증가하여 다음에 들어올 값의 index를 잡아 줌
        num++;

        if(rear == max) { // rear가 증가하다가 max(que 크기)와 같아지면 사실상 배열에 없는 index를 가리키기 때문에 0으로 초기화
            rear = 0;
        }

        return x;
    }

    // 큐에서 데이터를 디큐
    public int deque() throws EmptyIntQueueException {
        if(num <= 0) {
            throw new EmptyIntQueueException();
        }

        int x = que[front++];
        num--; // 데이터 갯수 값 감소

        if(front == max) { // enque와 마찬가지로 front의 값이 max(que의 크기)와 같아지면 0으로 다시 초기화
            front = 0;
        }
        return x;
    }

    // 큐에서 데이터를 피크(프런트 데이터를 들여다봄 : 디큐에서 꺼낼 데이터를 봄)
    public int peek() throws EmptyIntQueueException {
        if(num <= 0) {
            throw new EmptyIntQueueException();
        }

        return que[front]; // 이미 증가된 front값을 index에 넣기 때문에 다음번에 꺼내질 데이터를 확인해볼 수 있음(값의 변화는 x)
    }
    
    // 큐에서 x를 검색하여 인덱스(찾지 못하면 -1을 반환)를 반환
    public int indexOf(int x) {
        // 선형 검색(스캔의 시작은 배열의 첫 요소가 아니라 큐의 첫 요소(=front)
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % max;

            if(que[idx] == x) { // 검색 성공
                return idx;
            }
        }

        return -1; // 검색 실패
    }

    // 큐를 비움
    public void clear() {
        // num, front, rear값을 다시 0으로 초기화
        // 실제 que 배열 안의 값을 변경할 필요는 없음
        num = front = rear = 0;
    }

    // 큐의 용량을 반환
    public int capacity() {
        return max; // 큐의 용량
    }

    // 큐에 쌓여 있는 데이터 수를 반환
    public int size() {
        return num;
    }

    // 큐가 비어있는지 확인
    public boolean isEmpty() {
        return num <= 0; // num(데이터 수)이 0 이하면 비어있음
    }

    // 큐가 가득 찼는지 확인
    public boolean isFull() {
        return num >= max; // num(데이터의 수)이 max(que의 크기)와 같다면 가득 참
    }

    // 큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
    public void dump() {
        if(num <= 0) {
            System.out.println("큐가 비어있습니다.");
        } else {
            for(int i = 0; i < num; i++) {
                // (i + front) % max일 경우 front의 최대값(배열 index의 마지막 값)이 max보다 1이 작기 때문에
                // front에 i를 0부터 순차적으로 더해주면 현재 front -> rear 순서로 배열 index값이 찍힘
                // front를 중심으로 변하는 i를 더 해가면서 max로 mod해주면 됨
                // =============================================
                // front  : 7  7  7  7  7  7  7  7  7  7   7  7
                // i      : 0  1  2  3  4  5  6  7  8  9  10 11
                // max    : 12 12 12 12 12 12 12 12 12 12 12 12
                // result : 7  8  9  10 11  0  1  2  3  4  5  6
                // =============================================
                System.out.print(que[(i + front) % max] + " ");
            }
            System.out.println();
        }
    }

    public int search(int x) {
        if(num <= 0) {
            System.out.println("큐가 비었습니다.");
        } else {
            int res = 0;
            int location = 0;
            for (int i = 0; i < num; i++) {
                int idx = (i + front) % max;

                if(que[idx] == x) {
                    res = idx;
                }
            }
            location = res;

            if(location == front) {
                return 1;
            } else if(location > front) {
                return location - front + 1;
            } else if(location < front) {
                int y = indexOf(x);
                System.out.println((max - front) + (y + 1));
            }
        }

        return -1; // 검색 실패
    }

}
