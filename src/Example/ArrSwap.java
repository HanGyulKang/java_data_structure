package Example;

public class ArrSwap {
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,6,8,9,11,14,16,21};

        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
