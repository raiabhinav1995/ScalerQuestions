import java.util.Arrays;

public class AgressiveCows {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2};
        Arrays.sort(arr);
        int low = 1;
        int high = arr[arr.length - 1] - arr[0];
        int answer = 0;
        int numberOfCows = 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossible(arr, mid, numberOfCows)) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(answer);
    }

    public static boolean isPossible(int[] arr, int distance, int numberOfCows) {
        int cows = 1;
        int currentPosition = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - currentPosition >= distance) {
                cows++;
                currentPosition = arr[i];
                if (numberOfCows == cows) {
                    return true;
                }
            }
        }

        return false;
    }
}
