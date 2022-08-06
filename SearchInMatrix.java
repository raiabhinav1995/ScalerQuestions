public class SearchInMatrix {
    public static int searchMatrix(int[][] A, int B) {
        // Find row
        int rowNumber = -1;
        int rows = A.length - 1;
        int low = 0;
        int high = rows;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A[mid][0] <= B && A[mid][A[0].length - 1] >= B) {
                rowNumber = mid;
                break;
            } else if (A[mid][0] > B) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (rowNumber == -1) {
            return 0;
        }
        int[] row = A[rowNumber];
        int lowRow = 0;
        int highRow = row.length - 1;
        int columnNumber = -1;
        while (lowRow <= highRow) {
            int mid = (lowRow + highRow) / 2;
            if (row[mid] == B) {
                columnNumber = mid;
                break;
            } else if (row[mid] < B) {

                lowRow = mid + 1;
            } else {

                highRow = mid - 1;
            }
        }
        return (columnNumber == -1) ? 0 : 1;


        // Apply Binary search on that row
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{
                {3},
                {29},
                {36},
                {63},
                {67},
                {72},
                {74},
                {78},
                {85}};
        System.out.println(SearchInMatrix.searchMatrix(a, 36));
    }
}
