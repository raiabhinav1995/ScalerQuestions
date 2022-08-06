public class MatrixSearch {
    public static int searchMatrix(int[][] A, int B) {
        int row = -1;
        int col = A.length;
        while (row <= A.length - 1 && col >= 0) {

            
        }
        return 0;


    }

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        System.out.println(MatrixSearch.searchMatrix(mat, 34));
    }
}
