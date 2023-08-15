// program to find the curved surface area of Cylinder

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
	public static void main(String[] args) {
		// create a scanner object
		Scanner input = new Scanner(System.in);

		// read the radius and height of the cylinder
		System.out.print("\n Enter the radius and height of the cylinder [r, h] : ");
		float radius = input.nextFloat();
		float height = input.nextFloat();

		// calculate and print the curved surface of cylinder
		final float pie = (float) Math.PI;
		float curvedSurfaceAreaOfCylinder = 2f * pie * radius * height;
		System.out.println("\n Curved Surface Area of Cylinder = " + curvedSurfaceAreaOfCylinder + " units squared");

		input.close();
	}
}
