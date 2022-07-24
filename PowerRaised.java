public class PowerRaised {
    public static int powerRaised(int a, int b) {

        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        int result = powerRaised(a, b / 2);
        boolean isOdd = b % 2 != 0;
        if (isOdd) {
            return a * result * result;
        }
        return result * result;
    }

    public static void main(String[] args) {
        System.out.println(PowerRaised.powerRaised(2, 10));
    }
}
