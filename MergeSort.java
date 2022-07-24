public class MergeSort {
    public static void mergeSort(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        MergeTwoSortedArrayInRange.mergeArray(arr, l, mid, r);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 10, 6, 8, 15, 2, 12, 18, 1, 7};
        mergeSort(arr, 0, 9);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
