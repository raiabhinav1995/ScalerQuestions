public class CountInversion {
    public static void main(String[] args) {
        int[] arr = new int[]{28, 18, 44, 49, 41, 14};
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
        int copyOfP2 = p2;
        int[] mergedArray = new int[lastSortedIndex - firstSortIndex + 1];
        while (p1 <= middleSortIndex && p2 <= lastSortedIndex) {
            if (arr[p1] < arr[p2]) {
                mergedArray[p3] = arr[p1];
                p1++;
            } else if (arr[p1] > arr[p2]) {
                mergedArray[p3] = arr[p2];

                inversions += copyOfP2 - p1;
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
        for (int i = 0; i < (lastSortedIndex - firstSortIndex + 1); i++) {
            arr[firstSortIndex + i] = mergedArray[i];
        }
        return inversions;
    }
}
