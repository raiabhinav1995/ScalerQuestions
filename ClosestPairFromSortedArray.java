public class ClosestPairFromSortedArray {
    public static int[] closestPair(int[] firstArray, int[] secondArray, int value) {
        int p1 = 0;
        int p2 = secondArray.length - 1;
        int min = Integer.MAX_VALUE;
        int firstNumberIndex = firstArray.length;
        int secondNumberIndex = secondArray.length;
        while (p1 < firstArray.length && p2 >= 0) {
            int difference = Math.abs((value - firstArray[p1] - secondArray[p2]));
            int sum = firstArray[p1] + secondArray[p2];
            if (difference <= min) {
                if (p1 < firstNumberIndex || difference < min) {
                    firstNumberIndex = p1;
                }
                if ((p2 < secondNumberIndex && p1 == firstNumberIndex) || difference < min) {
                    secondNumberIndex = p2;
                }
                min = difference;

            }

            if (sum > value) {
                p2--;
            } else if (sum < value) {
                p1++;
            } else {
                p1++;
                p2--;
            }

        }
        return new int[]{firstArray[firstNumberIndex], secondArray[secondNumberIndex]};
    }

    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 2, 3, 4, 5};
        int[] secondArray = new int[]{2, 4, 6, 8};
        int value = 9;
        int[] arr = ClosestPairFromSortedArray.closestPair(firstArray, secondArray, value);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
