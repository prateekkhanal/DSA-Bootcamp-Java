// program to find the perimeter of a parallelogram

import java.util.Scanner;

public class PerimeterOfParallelogram {
	public static void main(String[] args) {
		// create a scanner object
		Scanner input = new Scanner(System.in);

		// read the input from the user
		System.out.print("\n Enter the length of the sides of the parallelogram [a,b] : ");
		float a = input.nextFloat();
		float b = input.nextFloat();

		// calculate and print the perimeter of the parallelogram
		float perimeterOfParallelogram  = 2f*(a+b);
		System.out.println("\n Perimeter of Parallelogram : " + perimeterOfParallelogram + " units");

		input.close();
	}
}
