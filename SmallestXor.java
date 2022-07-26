public class SmallestXor {
    public static int minimumXor(int a, int b) {
        int setBitsInA = calculateSetBits(a);
        int bitsInA = calculateBitsInA(a);
        if (setBitsInA == b) {
            return a;
        } else if (b > setBitsInA) {
            int bitsToBeSet = b - setBitsInA;
            int count = 0;
            while (bitsToBeSet != 0) {
                if ((a & (1 << count)) == 0) {
                    bitsToBeSet--;
                    a = a | ((1 << count));
                }
                count++;
            }
            return a;
        } else {
//            Set bits in a> b
            int bitsToBeDeleted = setBitsInA - b;
            int count = 0;
            while (bitsToBeDeleted != 0) {
                if ((a & (1 << count)) != 0) {
                    bitsToBeDeleted--;
                    a = a & (~(1 << count));
                }
                count++;
            }
            return a;
        }
    }

    public static int calculateBitsInA(int a) {
        int count = 0;
        while (a != 0) {
            count++;
            a = a >> 1;
        }
        return count;
    }

    private static int calculateSetBits(int a) {
        int count = 0;
        while (a != 0) {
            a = a & a - 1;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(minimumXor(9, 3));
    }
}
