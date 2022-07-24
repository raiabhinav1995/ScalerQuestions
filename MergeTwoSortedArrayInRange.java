public class MergeTwoSortedArrayInRange {
    public static int[] mergeArray(int[] arr, int firstSortIndex, int middleSortIndex, int lastSortedIndex) {
        int p3 = 0;
        int p1 = firstSortIndex;
        int p2 = middleSortIndex + 1;
        int[] mergedArray = new int[lastSortedIndex - firstSortIndex + 1];
        while (p1 <= middleSortIndex && p2 <= lastSortedIndex) {
            if (arr[p1] <= arr[p2]) {
                mergedArray[p3] = arr[p1];
                p1++;
            } else if (arr[p1] > arr[p2]) {
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
        for (int i = 0; i < (lastSortedIndex - firstSortIndex + 1); i++) {
            arr[firstSortIndex + i] = mergedArray[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = MergeTwoSortedArrayInRange.mergeArray(new int[]{2, 5, 7, 12, 20, 24, 29}, 1, 3, 6);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
