import java.util.HashSet;

public class ZeroSubArraySum {
    public static int hasZeroSubarray(int[] arr) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                return 1;
            }
            set.add(sum);
        }
        return (set.size() == arr.length) ? 0 : 1;
    }

    public static void main(String[] args) {
        System.out.println(ZeroSubArraySum.hasZeroSubarray(new int[]{- 1, 1}));
    }
}
