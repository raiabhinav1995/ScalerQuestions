public class BinarySearchClassOne {
    public static int searchInsert(int[] A, int B) {
        // Search space
        int l = 0;
        int r = A.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (A[mid] == B) {
                return mid;
            } else if (A[mid] < B) {
                if (mid <= A.length - 2 && A[mid + 1] > B || mid == A.length - 1) {
                    return mid + 1;
                }
                l = mid + 1;
            } else {
                if (mid >= 0 && A[mid - 1] < B) {
                    return mid;
                }
                r = mid - 1;
            }
        }
        return -1;
    }

    public static int peakElement(int[] A) {
//        Given an array of integers A, find and return the peak element in it. An array element is peak if it is NOT smaller than its neighbors.
//For corner elements, we need to consider only one neighbor. We ensure that answer will be unique.
//NOTE: Users are expected to solve this in O(log(N)) time.
//        Problem Constraints
//1 <= |A| <= 100000
//1 <= A[i] <= 109
//        Input Format
//The only argument given is the integer array A.
//Output Format
//Return the peak element.
//Example Input
//Input 1:
//A = [1, 2, 3, 4, 5]
//Input 2:
//A = [5, 17, 100, 11]
//Example Output
//5
//Output 2:
// 100
//Example
//Explanation 1:
// 5 is the peak.
//Explanation 2:
// 100 is the peak.
        if (A.length == 1) {
            return A[0];
        }
        int l = 0;
        int r = A.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid > 0 && mid < A.length - 1) {
                if (A[mid] > A[mid - 1] && A[mid] > A[mid + 1]) {
                    return A[mid];
                } else if (A[mid] < A[mid + 1]) {
                    l = mid + 1;

                } else {
                    r = mid - 1;
                }

            } else {
                if (mid == 0) {
                    if (A[mid] > A[mid + 1]) {
                        return A[0];
                    } else {
                        return A[1];
                    }
                }
                if (mid == A.length - 1) {
                    if (A[mid] > A[mid - 1]) {
                        return A[mid];
                    } else {
                        return A[mid - 1];
                    }
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{141, 144, 145, 154, 229, 235, 243, 266, 344, 351, 466, 499, 512, 565, 641, 675, 690, 726, 805, 879, 978, 986};
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(BinarySearchClassOne.peakElement(arr));
    }
}
