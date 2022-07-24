public class MultipleLeftRotations {
    public static int[][] solve(int[] A, int[] B) {
        int[][] newArray = new int[B.length][];
        for (int i = 0; i < B.length; i++) {
            int[] temp = A.clone();
            int k = B[i];
            k = k % (temp.length);
            temp = reverse(temp, 0, k - 1);
            temp = reverse(temp, k, temp.length - 1);
            temp = reverse(temp, 0, temp.length - 1);
            newArray[i] = temp;
        }
        return newArray;
    }

    public static int[] reverse(int[] arr, int start, int end) {
        int left = start;
        int right = end;
        while (left <= right) {
            arr = swap(arr, left, right);
            left++;
            right--;
        }
        return arr;

    }

    public static int[] swap(int[] arr, int left, int right) {
        int temp = arr[(int) left];
        arr[(int) left] = arr[(int) right];
        arr[(int) right] = temp;
        return arr;
    }

    public static void main(String[] args) {
        System.out.print(MultipleLeftRotations.solve(new int[]{1, 2, 3, 4, 5}, new int[]{2, 3}));
    }
}


