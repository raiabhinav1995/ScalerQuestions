public class NumberOfSetDigits {
    public static int numberOfSetDigits(int number) {
        if (number == 1) {
            return 1;
        }
        if (number == 0) {
            return 0;
        }
        int modulo = (int) Math.pow(10, 9) + 7;
        int numberOfBits = (SmallestXor.calculateBitsInA(number) % modulo);
        long setBitsTillNumber = (((numberOfBits - 1) % modulo) * (long) ((1 << ((numberOfBits - 1) - 1)) % modulo)) % modulo;
        long onesToBeAdded = ((number % modulo - (long) (1 << (numberOfBits - 1)) % modulo) % modulo) + 1;
        return (int) (setBitsTillNumber % modulo + onesToBeAdded % modulo + (numberOfSetDigits(number - (1 << (numberOfBits - 1))) % modulo)) % modulo;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSetDigits(1000000000));
    }
}
