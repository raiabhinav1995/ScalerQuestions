import java.util.Arrays;

public class SubarrayWithGivenSum {
    public static int[] solve(int[] A, int B) {
        int[] prefixSum = new int[A.length];
        prefixSum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }
        int i = 0;
        int j = 1;
        while (j < A.length) {
            int sumTillJ;
            if (i != 0)
                sumTillJ = prefixSum[j] - prefixSum[i - 1];
            else {
                sumTillJ = prefixSum[j];
            }
            if (sumTillJ < B) {
                j++;
            } else if (sumTillJ > B) {
                i++;
            } else {
                return Arrays.copyOfRange(A, i, j + 1);
            }
        }
        return new int[]{-1};
    }

    public static void main(String[] args) {
        int[] problemArray = new int[]{1, 2, 3, 4, 5};
        int[] arr = SubarrayWithGivenSum.solve(problemArray, 5);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
