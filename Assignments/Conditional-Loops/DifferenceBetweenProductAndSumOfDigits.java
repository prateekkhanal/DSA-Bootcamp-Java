// program to print the subtraction of the product and sum of digits of an integer

import java.util.Scanner;

public class DifferenceBetweenProductAndSumOfDigits {
    public static void main(String[] ars) {
        // create a scanner object
        Scanner input = new Scanner(System.in);
        
        // read the number from the user
        System.out.print("\n Enter the number [n] : ");
        int number = input.nextInt();
        
        // print the difference between the product and sum of the digits of a number
        int temp = number, productOfDigits = 1, sumOfDigits = 0;
        System.out.print("\n (");
        while (temp!=0) {
            // get the most significant digit
            productOfDigits *= temp%10;
            System.out.printf(" %d %c", (temp%10), (temp/10 == 0) ? ' ' : 'x');
            temp /= 10;
        }
        System.out.print(") - ");
        temp = number;
        System.out.print(" (");
        while (temp!=0) {
            // get the most significant digit
            sumOfDigits += temp%10;
            System.out.printf(" %d %c", (temp%10), (temp/10 == 0) ? ' ' : '+');
            temp /= 10;
        }
        System.out.print(") = " + (productOfDigits - sumOfDigits));
        input.close();
    }
}
