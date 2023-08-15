// program to find the total surface area of a cube

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
	public static void main(String[] args) {
		// create a scanner object
		Scanner input = new Scanner(System.in);

		// read the length of a side of the cube
		System.out.print("\n Enter the length of the sides of the cube [a] : ");
		float length = input.nextFloat();

		// calculate and print the total surface area of cube 
		float totalSurfaceAreaOfCube = 6f * length * length;
		System.out.println("\n Total Surface Area of Cube = " + totalSurfaceAreaOfCube +  " units squared" );

		input.close();
	}
}
