public class ReversePairs {
    public static void main(String[] args) {
//        int[] arr = new int[]{14046, 57239, 78362, 99387, 27609, 55100, 65536, 62099, 40820, 33056, 88380, 78549, 57512, 33137, 81212, 32365, 42276, 65368, 52459, 74924, 25355, 76044, 78056, 45190, 94365, 58869, 20611};
        int[] arr = new int[]{2000000000, 2000000000, -2000000000};
        /*
//        5,1;14,1;7,1;7,3;14,3
//        */
        System.out.println(mergeSort(arr, 0, arr.length - 1));
    }

    public static int mergeSort(int[] arr, int l, int r) {
        if (l == r) {
            return 0;
        }
        int mid = (l + r) / 2;
        int firstSum = mergeSort(arr, l, mid);
        int secondSum = mergeSort(arr, mid + 1, r);
        int totalSum = mergeArray(arr, l, mid, r);
        return firstSum + secondSum + totalSum;
    }

    public static int mergeArray(int[] arr, int firstSortIndex, int middleSortIndex, int lastSortedIndex) {
        int p3 = 0;
        int p1 = firstSortIndex;
        int p2 = middleSortIndex + 1;
        int inversions = 0;
        int[] mergedArray = new int[lastSortedIndex - firstSortIndex + 1];
        int i = firstSortIndex;
        int j = middleSortIndex + 1;
        while (i <= middleSortIndex && j <= lastSortedIndex) {
            if (arr[i] > 2 * (long) arr[j]) {
//                Found pair
                System.out.println(arr[i] + "," + arr[j]);
                inversions += (middleSortIndex - i + 1);
                j++;
            } else {
                i++;
            }
        }
//        if (j == lastSortedIndex) {
//
//            inversions += (j - middleSortIndex);
//        }
        while (p1 <= middleSortIndex && p2 <= lastSortedIndex) {
            if (arr[p1] < arr[p2]) {
                mergedArray[p3] = arr[p1];

                p1++;
            } else {
                mergedArray[p3] = arr[p2];
                p2++;
            }
            p3++;
        }
        while (p1 <= middleSortIndex) {
            mergedArray[p3] = arr[p1];
            p1++;
            p3++;
        }
        while (p2 <= lastSortedIndex) {
            mergedArray[p3] = arr[p2];
            p2++;
            p3++;
        }
        for (int k = 0; k < (lastSortedIndex - firstSortIndex + 1); k++) {
            arr[firstSortIndex + k] = mergedArray[k];
        }
        return inversions;
    }
}
