import java.util.Arrays;

public class TripletsSumZero {
    public static int findTripletPair(int[] arr) {
        int lengthOfArray = arr.length;
        Arrays.sort(arr);
        int numberOfPairs = 0;
        for (int i = 0; i < lengthOfArray; i++) {
            int p1 = i + 1;
            int p2 = lengthOfArray - 1;
            int required = arr[i] * -1;
            while (p1 < p2) {
                int sumOfP1P2 = arr[p1] + arr[p2];
                if (sumOfP1P2 < required) {
                    p1++;
                } else if (sumOfP1P2 > required) {
                    p2--;
                } else {
                    if (arr[p1] == arr[p2]) {
//                        All elements from p1 to p2 are same add pairs
                        int frequency = p2 - p1 + 1;
                        numberOfPairs = 1;
                        p1++;
                        p2--;
                        p1 = p2;
                    } else {
                        int count1 = 1;
                        int count2 = 1;
                        while (p1 < p2) {
                            if (arr[p1] == arr[p1 + 1]) {
                                p1++;
                                count1++;
                            } else {
                                p1++;
                                break;
                            }
                        }
                        while (p2 > p1) {
                            if (arr[p2] == arr[p2 - 1]) {
                                p2--;
                                count2++;
                            } else {
                                p2--;
                                break;
                            }
                        }
                        numberOfPairs += 1;
                    }
                }
            }
        }
        return numberOfPairs;
    }

    public static void main(String[] args) {
        System.out.println(TripletsSumZero.findTripletPair(new int[]{-1, 0, 1, 2, -1, 4}));
    }
}
