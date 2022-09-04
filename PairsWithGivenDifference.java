import java.util.Arrays;
import java.util.HashSet;

public class PairsWithGivenDifference {
    public static int pairsWithGivenDifference(int[] arr, int diff) {
        int p1 = 0;
        int p2 = 1;
        int arrayLength = arr.length;
        HashSet<String> set = new HashSet<>();
        Arrays.sort(arr);
        int numberOfPairs = 0;
        while (p1 != p2 && p2 < arrayLength) {
            int currentDiff = arr[p2] - arr[p1];
            if (currentDiff > diff) {
//                Reduce current diff
                p1++;
            } else if (currentDiff < diff) {
//                Increase current difference
                p2++;
            } else {
//                We got a pair
                String s = arr[p1] + " " + arr[p2];
                if (!set.contains(s)) {
                    set.add(s);
                    numberOfPairs++;
                }
                p1++;
                p2++;
            }
        }
        return numberOfPairs;
    }

    public static void main(String[] args) {
        System.out.println(PairsWithGivenDifference.pairsWithGivenDifference(new int[]{1, 2}, 0));

    }
}
