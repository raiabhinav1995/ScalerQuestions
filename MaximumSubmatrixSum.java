public class MaximumSubmatrixSum {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {-93, 19},
//                {11, 97},
//                {38, 48, 71, 71}
        };
        System.out.println(solve(arr));
    }

    public static long solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        if (rows == 1) {
            long[] copyArray = new long[cols];
            for (int i = 0; i < cols; i++) {
                copyArray[i] = A[0][cols];
            }
            return returnMaximumSum(copyArray);
        }
        long sum = 0;
        long maxSum = (long) Integer.MIN_VALUE;
        for (int left = 0; left < cols; left++) {
            long[] sumsArray = new long[rows];
            for (int right = left; right < cols; right++) {
                for (int i = 0; i < rows; i++) {
                    sumsArray[i] = sumsArray[i] + (long) A[i][right];
                }
//                Run kadane Algorithm
                sum = returnMaximumSum(sumsArray);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    private static long returnMaximumSum(long[] sumsArray) {
        long sum = Integer.MIN_VALUE;
        long maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < sumsArray.length; i++) {
            if (sum < 0) {
                sum = 0;
            }

            sum += sumsArray[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return (long) maxSum;
    }
}
