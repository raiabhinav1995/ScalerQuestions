import java.lang.*;
import java.util.*;

public class IsPrime {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int numberToBeChecked = sc.nextInt();
        int count = 0;
        for (int i = 1; i * i <= numberToBeChecked; i++) {
            if (numberToBeChecked % i == 0) {
                count += 2;
            }
        }

        if (count == 2) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}