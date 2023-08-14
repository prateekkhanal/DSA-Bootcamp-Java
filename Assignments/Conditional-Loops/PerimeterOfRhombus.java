// program to find the perimeter of class Rhombus 
import java.util.Scanner;

public class PerimeterOfRhombus {
	public static void main(String[] args) {
		// create a scanner object
		Scanner input = new Scanner(System.in);

		// read the length of the sides of the rhombus
		System.out.print("\n Enter the length of the sides of the rhombus [l] : ");
		float length = input.nextFloat();

		// calculate and print the perimeter of the rhombus
		float perimeterOfRhombus = 4f * length;
		System.out.println("\n Perimeter of Rhombus : " + perimeterOfRhombus + " units!");

		input.close();
	}
}
