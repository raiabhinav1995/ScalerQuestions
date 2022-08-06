import java.util.Arrays;

public class MaximumUnsortedSubarray {
    public static void returnMinSortedLength(int[] arr) {
        int[] unsortedArray = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(arr);
        int start = -1;
        int end = -1;
        for (int i = 0; i < unsortedArray.length; i++) {
            if (unsortedArray[i] != arr[i]) {
                start = i;
                int j = arr.length - 1;
                while (j >= start) {
                    if (arr[j] != unsortedArray[j]) {
                        end = j;
                        break;
                    }
                    j--;
                }
            }
        }
        System.out.println(start + " " + end);
//        1, 2, 3, 5, 6, 13, 15, 16, 17, 13, 13, 15, 17, 17, 17, 17, 17, 19, 19
//        1 2 3 5 6 13 13 13 15 16 17 17 17 17 17 19 19

    }


    public static void main(String[] args) {
        returnMinSortedLength(new int[]{1, 2, 3, 5, 6, 13, 15, 16, 17, 13, 13, 15, 17, 17, 17, 17, 17, 19, 19});
    }
}
