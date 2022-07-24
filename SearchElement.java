import java.lang.*;
import java.util.*;

public class SearchElement {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        for (int i = 0; i < numberOfTestCases; i++) {
            int lengthOfArray = sc.nextInt();
            int[] arr = new int[lengthOfArray];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            int searchElement = sc.nextInt();
            System.out.println(linearSearch(arr, searchElement));


        }

    }

    public static int linearSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return 1;
            }
        }
        return 0;
    }
}