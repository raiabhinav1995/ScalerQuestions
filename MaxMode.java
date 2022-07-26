import java.util.Arrays;

public class MaxMode {
    public static int solve(int[] A) {
        Arrays.sort(A);
        int max = A[A.length - 1];
        int i = A.length - 2;
        int min = A[i];
        while (i >= 0 && A[i] == max) {
            i--;
        }
        if (i == -1) {
            return 0;
        }
        min = A[i];
        return min % max;
    }

    public static void main(String[] args) {
        MaxMode.solve(new int[]{5, 5, 5, 5, 5});
    }

}
