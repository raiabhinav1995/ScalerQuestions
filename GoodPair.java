public class GoodPair {
    public static int solve(int[] A, int B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] == B) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println((GoodPair.solve(new int[]{1,2,3,4},7)));
    }
}
