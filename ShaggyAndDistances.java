import java.util.HashMap;

public class ShaggyAndDistances {
    public static int findMinimumDistance(int[] arr) {
        /*Shaggy has an array A consisting of N elements.We call a pair of distinct indices in that array a special if
        elements at those indices in the array are equal.

                Shaggy wants you to find a special pair such that the distance between that pair is minimum.
        Distance between two indices is defined as | i - j |.If there is no special pair in the array, then return - 1.*/
//        A = [7, 1, 3, 4, 1, 7]
//        Output: 3
//        A = [1, 1]
//        Output:1
//        Idea: We need for any element, the last/ closest occurance of that element for that index that would help us calculate
//        minimum value of |j-i|
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int minDistance = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                int closestOccurance = hashMap.get(arr[i]);
                minDistance = Math.min(minDistance, i - closestOccurance);
            }
            hashMap.put(arr[i], i);
        }
        return minDistance == arr.length ? - 1 : minDistance;
    }

    public static void main(String[] args) {
        System.out.println(ShaggyAndDistances.findMinimumDistance(new int[]{7, 1, 3, 4, 1, 7}));
    }
}
