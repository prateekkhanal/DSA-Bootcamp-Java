// To find Armstrong Number between two given number. 

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);
		// input the number from the user
		System.out.print("\n Enter the range (x,y) : ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		// print all the armstrong number
		System.out.print("\n Armstrong Numbers between " + x + " and " + y + " : ");
		int sumOfCubeOfEachDigit;
		for (int i=++x; i<y; i++,x=i) {
			sumOfCubeOfEachDigit=0;
			while (x!=0) {
				sumOfCubeOfEachDigit += Math.pow((x%10), 3);
				x/=10;
			}
			if (sumOfCubeOfEachDigit == i) {
				System.out.printf(" %d,", i);
			}
		}
		System.out.print("\b \n\n");

		input.close();
	}
}
