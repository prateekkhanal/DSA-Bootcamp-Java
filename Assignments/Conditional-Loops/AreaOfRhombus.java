// program to get area of rhombus
import java.util.Scanner;

public class AreaOfRhombus {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);

		// read the length of the diagonals from the user
		System.out.print("\n Enter the length of the diagonals [p, q] : ");
		float diagonal1 = input.nextInt();
		float diagonal2 = input.nextInt();

		// calculate and print the area
		float areaOfRhombus = (diagonal1 * diagonal2) / 2;
		System.out.println("\n Area of the rhombus : " + areaOfRhombus);

		input.close();
	}
}
