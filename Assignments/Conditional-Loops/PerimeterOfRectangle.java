// program to find the perimeter of a Rectangle
import java.util.Scanner;

public class PerimeterOfRectangle {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);

		// read the length and breadth of the rectangle from the user
		System.out.print("\n Enter the length and breadth of the rectangle [b, h] : ");
		float length = input.nextInt();
		float breadth = input.nextInt();

		// calculate and print the perimeter of the rectangle to the user
		float perimeterOfRectangle = 2f * (length * breadth);
		System.out.println("\n Perimeter of the Rectangle : " + perimeterOfRectangle + " units!");
		
		input.close();
	}
}
