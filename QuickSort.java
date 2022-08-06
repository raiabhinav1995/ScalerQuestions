public class QuickSort {
    public static void quickSort(int[] A, int l, int r) {
        // Base case
        // Making pivot element reach its required position
        if (l >= r) {
            return;
        }
        int correctPosition = rearrange(A, l, r);
        System.out.println(correctPosition);
        // Recursively calling for two smaller parts
        quickSort(A, l, correctPosition - 1);
        quickSort(A, correctPosition + 1, r);

    }

    public static int rearrange(int[] A, int start, int end) {
        int p1 = start + 1;
        int p2 = end;
        int pivot = A[start];
        // Check if p1 is happy or not, if yes increament p1
        while (p1 <= p2) {
            if (A[p1] <= pivot) {
                // p1 is happy
                p1++;
            } else if (A[p2] > pivot) {
                p2--;
            } else {
                swap(A, p1, p2);
                p1++;
                p2--;
            }
        }
        swap(A, start, p2);
        return p2;

    }

    public static void swap(int[] A, int start, int end) {
        int temp = A[start];
        A[start] = A[end];
        A[end] = temp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 2, 4, 5};
        int[] c = solve(a);
        for (int b : c) {
            System.out.println(b);
        }
    }

    public static int[] solve(int[] A) {
        quickSort(A, 0, A.length - 1);
        return A;
    }

}