import java.lang.*;
import java.util.*;

public class RotationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfInputs = sc.nextInt();
        long[] arr = new long[numberOfInputs];
        for (int i = 0; i < numberOfInputs; i++) {
            arr[i] = sc.nextLong();
        }
        int k = sc.nextInt();
        k = k % (arr.length);
        arr = reverse(arr, 0, arr.length - 1);
        arr = reverse(arr, 0, k - 1);
        arr = reverse(arr, k, arr.length - 1);
        for (int i = 0; i < numberOfInputs; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static long[] reverse(long[] arr, long start, long end) {
        long left = start;
        long right = end;
        while (left <= right) {
            swap(arr, left, right);
            left++;
            right--;
        }
        return arr;

    }

    public static long[] swap(long[] arr, long left, long right) {
        long temp = arr[(int) left];
        arr[(int) left] = arr[(int) right];
        arr[(int) right] = temp;
        return arr;
    }
}