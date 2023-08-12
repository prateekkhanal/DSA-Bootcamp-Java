// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class ArithmeticOperation {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);
		// input the operands
		int a,b;
		System.out.print("\n Enter the two operands [x, y] : ");
		a = input.nextInt();
		b = input.nextInt();
		// input the operator
		System.out.print("\n Enter the operator [+ - / *] : ");
		char operator = input.next().charAt(0);

		// return the result based on the Operation
		if (operator == '+') {
			System.out.println("\n " + a + " " + operator + " " + b + " = " + (a+b));
		} else if (operator == '-') {
			System.out.println("\n " + a + " " + operator + " " + b + " = " + (a-b));
		} else if (operator == '/' ) {
			System.out.println("\n " + a + " " + operator + " " + b + " = " + (a/b));
		} else if (operator == '*') {
			System.out.println("\n " + a + " " + operator + " " + b + " = " + (a*b));
		} else {
			System.out.println("\n " + "'" + operator +"' is not a valid operator!\n");
		}
		input.close();
	}
}
