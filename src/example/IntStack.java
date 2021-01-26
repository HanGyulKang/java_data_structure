package example;

// int형 스택
public class IntStack {
    private int max; // 스택 용량
    private int ptr; // 스택 포인터(스택의 인덱스를 가리킨다는 의미)
    private int[] stk; // 스택 본체를 참조하는 배열 변수

    // 실행 시 예외 : 스택이 비어있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    // 실행 시 예외 : 스택이 가득 참
    public class  OverflowIntStackException extends  RuntimeException {
        public OverflowIntStackException() {}
    }

    // 생성자
    public IntStack(int capacity) {
        ptr = 0; // 배열 요소에 1을 더한 값과 같음, 비어있으면 0
        max = capacity;

        try {
            stk = new int[max]; // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) { // 생성할 수 없음
            // 배열 본체 생성에 실패할 경우 max의 값을 0으로 합니다.
            // 이렇게 하면 다른 메서드가 존재하지 않는 배열에 잘못 접근하는 것을 막을 수 있습니다.
            max = 0;
        }
    }

    // 스택에 x를 푸시
    public int push(int x) throws OverflowIntStackException {
        if(ptr >= max) { // 스택이 가득 참
            throw new OverflowIntStackException();
        }
        // 전달받은 x를 배열 요소에 저장 후 스택 포인터 증가
        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException {
        if(ptr <= 0) { // 스택이 비어있음
            throw new EmptyIntStackException();
        }
        // ptr은 index + 1이기 때문에 전위 감소 연산자(들어올 때 이미 값 - 1)를 붙여줘야 한다.
        return stk[--ptr];
    }

    // 피크 메서드(스택의 꼭대기에 있는 데이터를 "몰래 엿보는" 메서드
    // 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
    public int peek() throws EmptyIntStackException {
        if(ptr <= 0) { // 스택이 비어있을 경우
            throw new EmptyIntStackException();
        }
        // 스택이 비어있지 않다면 꼭대기의 요소 값을 반환
        // 데이터의 입력이나 출입이 없으므로 스택 포인터는 변하지 않음
        return stk[ptr - 1];
    }

    // 꼭대기부터 바닥까지 선형 검색(꼭대기부터 검색하는 이유는 "먼저 팝이 되는 데이터"를 찾기 위함)
    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0 ; i--) { // 꼭대기(정상)부터 바닥까지 선형 검색
            if(stk[i] == x) {
                return i; // 검색 성공
            }
        }

        return -1; // 검색 실패
    }

    // 스택에 쌓여있는 모든 데이터를 삭제
    public void clear() {
        // 스택에 대한 입출은 스택 포인터를 바탕으로 이루어집니다.
        // 따라서 스택의 배열 요솟값을 변경할 필요가 없습니다. 모든 요소의 삭제는 스택 포인터의 값을 0으로 하면 끝납니다.
        ptr = 0;
    }

    // 스택의 용량을 반환
    public int capacity() {
        // 스택의 용량, 즉 max를 반환
        return max;
    }

    // 스택에 쌓여있는 데이터 갯수를 반환
    public int size() {
        // ptr은 배열 index + 1, 즉 요소의 갯수
        return ptr;
    }

    // 스택이 비어있는지 확인
    public boolean isEmpty() {
        // ptr(요소의 갯수, 스택 포인터)이 0이하일 경우 true, 아니면 false 반환
        return ptr <= 0;
    }

    // 스택이 가득 찼는지 확인
    public boolean isFull() {
        // ptr이 max(배열 생성시 size) 이상이라면 가득 참
        return ptr >= max;
    }

    // 스택 안의 모든 데이터를 바닥 -> 꼭대기 순으로 출력
    public void dump() {
        if(ptr <= 0) { // 스택이 비었을 경우
            System.out.println("스택이 비어있습니다.");
        } else {
            // max는 배열 size, ptr은 배열 안에 들어있는 데이터의 최종 index + 1
            // 고로 i는 max미만이 아닌 ptr미만으로 하여 있는 데이터만 추출
            for (int i = 0; i < ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            // 모두 출력 후 줄바꿈
            System.out.println();
        }
    }
}
