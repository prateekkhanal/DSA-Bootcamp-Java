// Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class PrintLargestNumber {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);
		// get the two numbers from the user
		System.out.print("\n Enter the First Number [x] : ");
		int x = input.nextInt();
		System.out.print("\n Enter the Second Number [y] : ");
		int y = input.nextInt();

		System.out.printf("\n Largest Number : %s\n", (x>y) ? x : y);
		input.close();
	}
}
