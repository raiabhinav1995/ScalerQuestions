import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printTableTillTen(number);

    }

    public static void printTableTillTen(int number) {
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
