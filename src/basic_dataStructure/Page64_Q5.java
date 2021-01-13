package basic_dataStructure;

public class Page64_Q5 {
    static void reverseArr(int[] arr_a, int[] arr_b) {
        for (int i = 0; i < arr_a.length; i++) {
            arr_b[arr_a.length - i - 1] = arr_a[i];
        }
    }

    public static void main(String[] args) {
        int[] arr_a = {2,4,43,5,6,17,8,9,12};
        int[] arr_b = new int[arr_a.length];

        reverseArr(arr_a, arr_b);
        for (int i = 0; i < arr_b.length; i++) {
            System.out.print(arr_b[i] + " ");
        }
    }
}
