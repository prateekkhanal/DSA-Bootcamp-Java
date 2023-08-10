import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		// Create the scanner object
		Scanner input = new Scanner(System.in);
		// input the year
		int year;
		boolean leapYear=false;
		System.out.print("\n Enter the year : ");
		year = input.nextInt();

		// check if the year was leap year
		if (year%4 == 0) {
			leapYear = true;
		}

		if (leapYear) {
			System.out.printf("\n " + year + " %s" + " a Leap Year!\n", (leapYear) ? "IS" : "is NOT");
		}

		input.close();
	}
}
