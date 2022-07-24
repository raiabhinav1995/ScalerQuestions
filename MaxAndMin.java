import java.lang.*;
import java.util.*;

public class MaxAndMin {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int numberOfElements = sc.nextInt();
        int[] arr = new int[numberOfElements];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print(max + " " + min);

    }
}