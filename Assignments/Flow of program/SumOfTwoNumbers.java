// take two numbers and print the sum of both

import java.util.Scanner;

public class SumOfTwoNumbers {
	public static void main(String[] args) {
		// create the scanner class
		Scanner input = new Scanner(System.in);
		int a, b;
		System.out.print("\n Enter the first number [x] : ");
		a = input.nextInt();
		System.out.print("\n Enter the second number [y] : ");
		b = input.nextInt();

		// print the sum of two numbers 
		System.out.println("\n " + a + " + " + b + " = " + (a+b));
		input.close();
	}
}
