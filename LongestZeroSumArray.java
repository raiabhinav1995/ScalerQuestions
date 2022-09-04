import java.util.Arrays;
import java.util.HashMap;

public class LongestZeroSumArray {
    public static int[] longSubArrayZeroSum(int[] arr) {
        long sum = 0;
        int longestSubArrayLength = - 1;
        int startingIndex = - 1;
        int endingIndex = - 1;
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                int previousIndex = map.get(sum);
                int currentDistance = i - previousIndex;
                if (currentDistance > longestSubArrayLength) {
                    longestSubArrayLength = currentDistance;
                    startingIndex = previousIndex + 1;
                    endingIndex = i;
                }
            } else {
                map.put(sum, i);
            }
            if (sum == 0) {
//                This subarray from 0 till ith index is 0
                if ((i + 1) > longestSubArrayLength) {
                    longestSubArrayLength = i + 1;
                    startingIndex = 0;
                    endingIndex = i;
                }

            }
        }
        return (startingIndex == - 1 || endingIndex == - 1) ? new int[0] : Arrays.copyOfRange(arr, startingIndex, endingIndex + 1);
    }

    public static void main(String[] args) {
        int[] arr = LongestZeroSumArray.longSubArrayZeroSum(new int[]{- 8, 8, - 1, - 16, - 28, - 27, 15, - 14, 14, - 27, - 5, - 6, - 25, - 11, 28, 29, - 3, - 25, 17, - 25, 4, - 20, 2, 1, - 17, - 10, - 25});
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
