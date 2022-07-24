import java.lang.*;
import java.util.*;

public class IsItPerfect {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int numberOfInputs = sc.nextInt();
        int[] inputArray = new int[numberOfInputs];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = sc.nextInt();
            if (inputArray[i] == findFactorsSum(inputArray[i])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static int otherFactor(int number, int firstFactor) {
        return number / firstFactor;
    }

    public static int findFactorsSum(int number) {
        int sum = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i)
                    sum += number / i;
            }
        }
        return sum;
    }
}