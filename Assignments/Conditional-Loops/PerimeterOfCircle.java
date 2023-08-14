// program to find the perimeter of circle

import java.util.Scanner;

public class PerimeterOfCircle {
	public static void main(String[] args) {
		// create a scanner object
		Scanner input = new Scanner(System.in);

		// read the radius of the circle
		System.out.print("\n Enter the radius of the circle [r] : ");
		float radius = input.nextFloat();

		// calculate and print the area of the circle
		float perimeterOfCircle = 2f * 3.14159f * radius;
		System.out.println("\n Perimeter of Circle : " + perimeterOfCircle + " units!");

		input.close();
	}
}
