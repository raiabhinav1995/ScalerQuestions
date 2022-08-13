import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class ThreeSum {
    public static int[][] threeSum(int[] A) {
        Arrays.sort(A);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        TreeSet<String> set
                = new TreeSet<String>();
        for (int i = 0; i < A.length; i++) {
            int currentElement = A[i];
            int elementToBeFound = currentElement * -1;
            int p1 = i + 1;
            int p2 = A.length - 1;

//            [-1,-1,0,1,2,4]
            while (p1 < p2) {
                if (elementToBeFound < A[p1] + A[p2]) {
                    p2--;
                } else if (elementToBeFound > A[p1] + A[p2]) {
                    p1++;
                } else {
//                    Triplet t = new Triplet(A[i], A[p1], A[p2]);
                    String str
                            = A[i] + ":" + A[p1]
                            + ":" + A[p2];
                    if (!set.contains(str)) {
                        set.add(str);
                        ArrayList<Integer> tempList = new ArrayList<>();
                        tempList.add(A[i]);
                        tempList.add(A[p1]);
                        tempList.add(A[p2]);
                        list.add(tempList);
                    }

                    p1++;
                    p2--;
                }
            }
        }
        return list.stream().map(u -> u.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
    }

    public static void main(String[] args) {
        int[][] a = ThreeSum.threeSum(new int[]{-1, -1, 0, 1, 2, 4});
        for (int[] b : a) {
            for (int c : b) {
                System.out.print(c + " ");
            }
        }
    }
}

class Triplet {
    int a;
    int b;
    int c;

    Triplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
