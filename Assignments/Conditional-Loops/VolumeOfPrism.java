// program to find the volume of a prism

import java.util.Scanner;

public class VolumeOfPrism {
	public static void main(String[] args) {
		// create a scanner object
		Scanner input = new Scanner(System.in);

		// read the length, breadth and height of the prism
		System.out.print("\n Enter the length, breadth and height of the prism [l,b,h] : ");
		float length = input.nextFloat();
		float breadth = input.nextFloat();
		float height = input.nextFloat();

		// calculate and print the volume of the prism
		float volumeOfPrism = length * breadth * height;
		System.out.println("\n Volume of Prism : " + volumeOfPrism + " units cube");

		input.close();
	}
}
