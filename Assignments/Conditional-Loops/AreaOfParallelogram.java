// program to calculate the area of the parallelogram

import java.util.Scanner;

public class AreaOfParallelogram {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);

		// read the input from the user
		System.out.println("\n Enter the breadth and height of the parallelogram : ");
		int breadth = input.nextInt();
		int height = input.nextInt();

		// calculate and print the area of the parallelogram
		int areaOfParallelogram = breadth * height;
		System.out.println("\n Area of the parallelogram : " + areaOfParallelogram + " sq. units");

		input.close();
	}
}
