package Example;

// 제네릭 클래스의 예
public class GenericClassTester {
    // 제네릭 클래스의 파라미터를 T라고 작성합니다.
    static class GenericClass<T> {
        private T xzy;

        GenericClass(T t) { // 생성자
            this.xzy = t;
        }

        T getXzy() { // xyz를 반환합니다.
            return xzy;
        }
    }

    public static void main(String[] args) {
        // 다음과 같이 파라미터에 String을 넘길 수도 있고 Integer를 넘길 수도 있습니다.
        GenericClass<String> s = new GenericClass<>("ABC");
        GenericClass<Integer> n = new GenericClass<>(123);

        System.out.println(s.getXzy());
        System.out.println(n.getXzy());
    }
}
