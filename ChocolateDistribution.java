import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 1, 9, 56, 7, 9, 12};
        System.out.println(ChocolateDistribution.solve(arr, 5));
    }

    public static int solve(int[] A, int B) {
        if (B == 0) {
            return 0;
        }
        if (A.length == 0) {
            return 0;
        }
        Arrays.sort(A);
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - B + 1; i++) {
            int difference = A[B + i - 1] - A[i];
            if (difference < minDifference) {
                minDifference = difference;
            }
        }
        return minDifference;
    }
}
