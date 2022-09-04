import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] A, int B) {
        Arrays.sort(A);
        if (A.length == 3) {
            return A[0] + A[1] + A[2];
        }
        int minDifferece = A.length;
        int answer = - 1;
        for (int i = 0; i < A.length; i++) {
            int p1 = i + 1;
            int p2 = A.length - 1;
            int required = B - A[i];
            while (p1 < p2) {
                int sum = A[p1] + A[p2];
                int currentDifference = Math.abs(sum - required);
                if (currentDifference < minDifferece) {
                    minDifferece = currentDifference;
                    answer = A[i] + sum;
                }
                if (sum < required) {
                    p1++;
                } else if (sum > required) {
                    p2--;
                } else {
                    answer = A[i] + sum;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(ThreeSumClosest.threeSumClosest(new int[]{5, - 2, - 1, - 10, 10}, 5));
    }
}
