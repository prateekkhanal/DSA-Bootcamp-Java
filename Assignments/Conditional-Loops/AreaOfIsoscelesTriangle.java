// program to find the area of the isosceles triangle

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);

		// input the breadth and height of the triangle from the user
		System.out.print("\n Enter the breadth and height of the Isosceles Triangle : ");
		int breadth = input.nextInt();
		int height = input.nextInt();

		// calculate and print the area of the isosceles triangle
		float areaOfIsoscelesTriangle = (breadth*height)/2;
		System.out.println("\n Area of the Isosceles Triangle : " + areaOfIsoscelesTriangle + " units squared");

		input.close();
	}
}
