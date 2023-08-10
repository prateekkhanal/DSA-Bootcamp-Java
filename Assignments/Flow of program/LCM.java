import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);

		// take two numbers as input
		int x, y;
		System.out.print("\n Enter the first number [x] : ");
		x = input.nextInt();
		System.out.print("\n Enter the second number [y] : ");
		y = input.nextInt();

		int lcm = (x>y) ? x : y;
		
		while (1) {
			if (lcm%x == 0 && lcm%y == 0) {

			}
		}
		
		input.close();
	}
}
