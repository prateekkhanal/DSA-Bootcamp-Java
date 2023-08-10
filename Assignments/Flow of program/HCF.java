// take two numbers as inputs and find their HCF and LCM

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);
		// take two numbers as input
		int x, y;
		System.out.print("\n Enter the first number [x] : ");
		x = input.nextInt();
		System.out.print("\n Enter the second number [y] : ");
		y = input.nextInt();

		// find the HCF
		int hcf=1;
		for (int i=(x<y) ? x : y; i>=2; i--) {
			if ((x%i == 0) && (y%i == 0)) {
				hcf = i;
				break;
			}
		}
		System.out.println("\n HCF of " + x + " and " + y + " = " + hcf);
		// close the scanner object
		input.close();
	}
}
