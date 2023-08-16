// program to print fibonacci series

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // create a scanner object
        Scanner input = new Scanner(System.in);
        
        // read the nth term upto the fibonacci series is to be printed
        System.out.print("\n Enter the nth Term up to which fibonaccie series is to be printed : ");
        int term = input.nextInt();

       // print the fibononacci series
       int secondLastTerm=1, thirdLastTerm=0, temp;
       for (int currentTerm = 1; currentTerm <= term; currentTerm++) {
            if (currentTerm == 1 || currentTerm == 2) {
                System.out.printf(" %d +", (currentTerm-1));
            } else {
                System.out.printf(" %d +", secondLastTerm + thirdLastTerm);
                temp = secondLastTerm;
                secondLastTerm += thirdLastTerm;
                thirdLastTerm = temp;
            }
       } 
       System.out.print(" ...\n\n");
        
        input.close();
    }
}