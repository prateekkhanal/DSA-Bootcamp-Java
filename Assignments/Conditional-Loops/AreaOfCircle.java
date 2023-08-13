import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);
		// input the radius from the user
		System.out.print("\n Enter the radius of the circle [r] : ");
		float radius = input.nextFloat();
		// calculate the print the radius from the user
		float areaOfCircle = (float)3.1415926*(float)Math.pow(radius,2);
		System.out.printf("\n Area of circle with radius [%.2f] : %.2f unit squared\n\n", radius, areaOfCircle);
		input.close();
	}
}
