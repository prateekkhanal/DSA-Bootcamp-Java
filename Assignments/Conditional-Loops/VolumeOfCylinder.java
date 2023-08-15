// program to find the volume of cylinder

import java.util.Scanner;

public class VolumeOfCylinder {
	public static void main(String[] args) {
		// create a scanner object
		Scanner input = new Scanner(System.in);

		// read the radius and height of the cylinder
		System.out.print("\n Enter the radius and height [r, h] : ");
		float radius = input.nextFloat();
		float height = input.nextFloat();

		// calculate and print the volume of the cylinder
		final float pie = (float) Math.PI;
		float volumeOfCylinder = pie * (float) Math.pow(radius, 2) * height;
		System.out.println("\n Volume of Cylinder = " + volumeOfCylinder + " units cube");

		input.close();
	}
}
