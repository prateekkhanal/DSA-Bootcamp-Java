// program to find the volume of cone

import java.util.Scanner;

public class VolumeOfCone {
	public static void main(String[] args) {
		// create a scanner object
		Scanner input = new Scanner(System.in);

		// read the radius and height from the user
		System.out.print("\n Enter the radius and height of the cone : ");
		float radius = input.nextFloat();
		float height = input.nextFloat();

		// calculate and print the volume of a cone
		final float pie = (float)Math.PI;
		float volumeOfCone = (float) (pie * Math.pow(radius, 2) * (height/3f));
		System.out.println("\n Volume of Cone = " + volumeOfCone + " units cube");

		input.close();
	}
}
