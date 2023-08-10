// take a number as input and print the multiplication table for it

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);
		// input the number
		int x;
		System.out.print("\n Enter the number [x] : ");
		x = input.nextInt();

		// print the multiplication table
		for (int i=1; i<=10; i++) {
			System.out.println(x + " x " + i + " = " + (x*i));
		}

		// close the scanner object
		input.close();
	}
}
