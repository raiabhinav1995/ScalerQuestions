import java.util.Scanner;

public class SummationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberTillWhereSumToBeFound = sc.nextInt();
        int result = findSumTillNumberRecursive(numberTillWhereSumToBeFound);
        System.out.println(result);
    }

    public static int findSumTillNumber(int number) {
//        Time complexity will be O(n) where n is the input
        int sum = 0;
        while (number != 0) {
            sum += number;
            number -= 1;
        }
        return sum;
    }
    public static int findSumTillNumberRecursive(int number) {
//        Time complexity will be O(n) where n is the input
        if(number==0){
            return 0;
        }
        return number+findSumTillNumberRecursive(number-1);
    }
}
