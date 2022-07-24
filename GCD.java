public class GCD {
    public static int gcdOfTwoNumbers(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcdOfTwoNumbers(b % a, a);
    }

    public static int gcdOfArray(int[] a) {
        int gcd = gcdOfTwoNumbers(a[0], a[1]);
        for (int i = 2; i < a.length; i++) {
            gcd = gcdOfTwoNumbers(gcd, a[i]);
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(gcdOfArray(new int[]{10, 12, 60}));
    }
}
