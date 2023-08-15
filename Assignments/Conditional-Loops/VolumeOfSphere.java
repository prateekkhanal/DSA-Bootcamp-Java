// program to find the volume of sphere

import java.util.Scanner;

public class VolumeOfSphere {
	public static void main(String[] args) {
		// create a scanner object
		Scanner input = new Scanner(System.in);

		// read the radius of the sphere
		System.out.print("\n Enter the radius of the sphere [r] : ");
		float radius = input.nextFloat();

		// calculate and print the volume of the sphere
		final float pie = (float) Math.PI;
		float volumeOfSphere = pie * 4f/3f * (float) Math.pow(radius,3);
		System.out.println("\n Volume of Sphere : " + volumeOfSphere);

		input.close();
	}
}
