import java.lang.*;
import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int tillNumbers=sc.nextInt();
        for(int i=1;i<=tillNumbers;i++){
            long armstrongValue=0;
            int k=i;
            while(k!=0){
                int remainder=k%10;
                int quotient=k/10;
                k=k/10;
                armstrongValue+=cube(remainder);
            }
            if(armstrongValue==i){
                System.out.println(i);
            }
        }

    }
    public static int cube(int number){
        return number*number*number;
    }
}