public class MergeTwoSortedArrays {
    public static int[] mergeTwoArrays(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
//        Initializing all three pointers to zero
        int p3 = 0;
        int p1 = 0;
        int p2 = 0;
        while (p1 < firstArray.length && p2 < secondArray.length) {
            if (firstArray[p1] <= secondArray[p2]) {
                mergedArray[p3] = firstArray[p1];
                p1++;
            } else if (firstArray[p1] >= secondArray[p2]) {
                mergedArray[p3] = secondArray[p2];
                p2++;
            }
            p3++;
        }
        while (p1 < firstArray.length) {
            mergedArray[p3] = firstArray[p1];
            p1++;
            p3++;
        }
        while (p2 < secondArray.length) {
            mergedArray[p3] = secondArray[p2];
            p2++;
            p3++;
        }
        return mergedArray;

    }

    public static void main(String[] args) {
        int[] merged = MergeTwoSortedArrays.mergeTwoArrays(new int[]{2, 5, 7, 12, 20, 24, 29}, new int[]{6, 9, 10, 14, 18, 19});
        for (int i = 0; i < merged.length; i++) {
            System.out.println(merged[i]);
        }
    }
}
