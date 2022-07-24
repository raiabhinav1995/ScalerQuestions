public class SquareRoot {
    public static void main(String[] args) {
//        System.out.println(SquareRoot.binarySearchSquare(49,1,49));
    }
    public static int binarySearchSquare(int number, int firstNumber, int lastNumber) {
        // System.out.print(number+" "+firstNumber+" "+lastNumber+"  ");
        int middleNumber = (firstNumber + lastNumber) / 2;
        long squareOfMiddleNumber = (long) middleNumber * middleNumber;
        if (firstNumber > lastNumber || lastNumber - firstNumber == 1) {
            return -1;
        } else if (number == squareOfMiddleNumber) {
            return middleNumber;
        } else if (number > squareOfMiddleNumber) {
            return binarySearchSquare(number, middleNumber, lastNumber);
        } else if (number < squareOfMiddleNumber) {
            return binarySearchSquare(number, firstNumber, middleNumber);
        } else {
            return -1;
        }

    }

    public int solve(int A) {
        return binarySearchSquare(A, 1, A);
    }

}
