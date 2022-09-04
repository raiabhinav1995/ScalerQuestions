import java.util.HashSet;

public class CountRectangles {

    public static int solve(int[] A, int[] B) {
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            hashSet.add(A[i] + " " + B[i]);
        }
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
//                A point is A[i],B[i] and A[j], B[j]
                if ((A[j] > B[j] && A[i] > B[i])) {
                    if (hashSet.contains(A[i] + " " + B[j]) && hashSet.contains(A[j] + " " + B[i])) {
                        count++;
                    }
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(CountRectangles.solve(new int[]{1, 1, 2, 2}, new int[]{1, 2, 1, 2}));
    }
}
