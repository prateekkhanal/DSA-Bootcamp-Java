// program to print the area of the Equilateral Triangle

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);

		// read the input from the user
		System.out.print("\n Enter the length of the side of the triangle [a] : ");
		int length = input.nextInt();

		// calculate and print the result
		float areaOfEquilateralTriangle = (float)(Math.pow(length,2) * (Math.sqrt(3)/4));
		System.out.println("\n Area of the Equilateral Triangle : " + areaOfEquilateralTriangle + " sq. units");

		input.close();
	}
}
