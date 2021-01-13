package basic_dataStructure;

public class Page64_Q4 {
    static void copyArr(int[] arr_a, int[] arr_b) {
        for (int i = 0; i < arr_a.length; i++) {
            arr_b[i] = arr_a[i];
        }
    }

    public static void main(String[] args) {
        int[] arr_a = {2,4,43,5,6,17,8,9,12};
        int[] arr_b = new int[arr_a.length];
        copyArr(arr_a, arr_b);

        for (int i = 0; i < arr_b.length; i++) {
            System.out.print(arr_b[i] + " ");
        }
    }
}
