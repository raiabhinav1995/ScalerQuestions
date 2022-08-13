import java.util.Arrays;

public class PairsWithGivenDifference {
    public static int pairsWithGivenDifference(int[] arr, int diff) {
        int p1 = 0;
        int p2 = 1;
        int arrayLength = arr.length;
        Arrays.sort(arr);
        int numberOfPairs = 0;
        while (p2 < arrayLength) {
            int currentDiff = arr[p2] - arr[p1];
            if (currentDiff > diff) {
//                Reduce current diff
                p1++;
            } else if (currentDiff < diff) {
//                Increase current difference
                p2++;
            } else {
//                We got a pair
                numberOfPairs++;
                p1++;
                p2++;
            }
        }
        return numberOfPairs;
    }

    public static void main(String[] args) {
        System.out.println(PairsWithGivenDifference.pairsWithGivenDifference(new int[]{1, 1, 1, 2, 2}, 0));

    }
}
