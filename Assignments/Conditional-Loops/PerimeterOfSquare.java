// program to find the perimeter of a square
import java.util.Scanner;

public class PerimeterOfSquare {
	public static void main(String[] args) {
		// create a scanner object
		Scanner input = new Scanner(System.in);

		// read the length of the sides of the rectangle 
		System.out.print("\n Enter the length of the sides of the square [l] : ");
		float length = input.nextFloat();
		
		// calculate and print the perimeter of the square
		float perimeterOfSquare = 4f * length;
		System.out.println("\n Perimeter of Square : " + perimeterOfSquare + " units!");
		
		input.close();
	}
}
