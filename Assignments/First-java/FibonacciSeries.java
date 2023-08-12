// To calculate Fibonacci Series up to n numbers

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);
		// get the nth term upto which you want to print the fibonacci Series
		System.out.print("\n Enter the term upto which you want to print the Fibonacci Series [n] : ");
		int nthTerm = input.nextInt();

		// reject if the input was negative
		if (nthTerm < 1) {
			System.out.println("\n Invalid Input! Must provide natural number as a term!");
			System.exit(1);
		}

		// print the fibonacci Series
		int thirdLastNo=0, secondLastNo=1, temp, term=3;
		for (int currentTerm=1; currentTerm <= nthTerm; currentTerm++) {
			// print individual terms upto the nthTerm
			if (term<currentTerm) {
				temp = thirdLastNo;
				thirdLastNo = secondLastNo;
				secondLastNo = secondLastNo+temp;
				term++;
			}
			System.out.printf(" %d +", (currentTerm == 1 || currentTerm == 2) ? (currentTerm-1) : (thirdLastNo + secondLastNo));
		}
		System.out.println(" ...\n\n");
		
		input.close();
	}
}
