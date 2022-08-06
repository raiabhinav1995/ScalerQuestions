public class RotatedSortedArraySearch {
    public static void main(String[] args) {
        System.out.println(RotatedSortedArraySearch.search(new int[]{19, 20, 21, 22, 28, 29, 32, 36, 39, 40, 41, 42, 43, 45, 48, 49, 51, 54, 55, 56, 58, 60, 61, 62, 65, 67, 69, 71, 72, 74, 75, 78, 81, 84, 85, 87, 89, 92, 94, 95, 96, 97, 98, 99, 100, 105, 107, 108, 109, 110, 112, 113, 115, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 128, 130, 131, 133, 134, 135, 136, 137, 138, 139, 141, 142, 144, 146, 147, 148, 149, 150, 153, 155, 157, 159, 161, 163, 164, 169, 170, 175, 176, 179, 180, 185, 187, 188, 189, 192, 196, 199, 201, 203, 205, 3, 7, 9, 10, 12, 13, 17}, 6));
    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int search(final int[] A, int B) {
        // Define search space
        int low = 0;
        int high = A.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A[mid] == B) {
                return mid;
            }
            if (low == high) {
                return -1;
            }
            if (A[low] < A[mid]) {
                // Left ArraySorted.
                if (A[low] <= B && A[mid] >= B) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
                continue;
            }
            if (A[mid] < A[high]) {
                // Right array sorted
                if (A[mid] <= B && A[high] >= B) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
