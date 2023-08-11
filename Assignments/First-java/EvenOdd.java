import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);
		// take input(integer) from the user
		System.out.print("\n Enter the number [n] : ");
		int num = input.nextInt();

		System.out.printf("\n " + num +" is %s", (num % 2 == 0) ? "EVEN!!!" : "ODD!!!\n");

		input.close();
	}
}
