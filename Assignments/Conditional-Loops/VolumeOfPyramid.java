// program to find the volume of pyramid

import java.util.Scanner;

public class VolumeOfPyramid {
	public static void main(String[] args) {
		// create a scanner object
		Scanner input = new Scanner(System.in);

		// read the length, width and height of the pyramid
		System.out.print("\n Enter the length, width and height of the pyramid [l, w, h] : ");
		float length = input.nextFloat();
		float width = input.nextFloat();
		float height = input.nextFloat();

		// calculate and print the volume of pyramid
		float volumeOfPyramid = (length * width * height)/3;
		System.out.print("\n Volume of Pyramid = " + volumeOfPyramid + " units cube\n");

		input.close();
	}
}
