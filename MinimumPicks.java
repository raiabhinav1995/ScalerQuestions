public class MinimumPicks {
    public int solve(int[] A) {
        int currentEvenMax = -2147483648;
        int currentOddMin = 2147483647;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0 && A[i] > currentEvenMax) {
                currentEvenMax = A[i];

            }
            if (A[i] % 2 != 0 && A[i] < currentOddMin) {
                currentOddMin = A[i];
            }
        }
        // System.out.println(currentEvenMax+" "+currentOddMin+" ");

        return currentEvenMax - currentOddMin;

    }
}
