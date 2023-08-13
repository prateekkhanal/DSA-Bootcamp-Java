import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);

		// get the length and breadth from the user
		System.out.print("\n Enter the length and breadth of the rectangle [l,b] : ");
		int length = input.nextInt();
		int breadth = input.nextInt();
		
		// calculate and print the length and breadth of the rectangle
		int areaOfRectangle = length * breadth;
		System.out.println("\n Area of the rectangle : " + areaOfRectangle);

		input.close();
	}
}
