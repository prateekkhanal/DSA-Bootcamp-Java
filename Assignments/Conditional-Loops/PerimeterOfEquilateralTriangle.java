// program to find the perimeter of a equilateral Triangle

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);

		// read the length of the sides of the triangle from the user
		System.out.print("\n Enter the length of the sides of the triangle [a] : ");
		float a = input.nextFloat();

		// calculate and print the perimeter to the user
		float perimeterOfEquilateralTriangle = 3f * a;
		System.out.println("\n Perimeter Of the Triangle : " + perimeterOfEquilateralTriangle + " units");

		input.close();
	}
}
