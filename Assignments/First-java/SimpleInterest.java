import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		
		// declare the variables to hold the data
		int principle, rate, time, interest;

		// create the scanner object
		Scanner input = new Scanner(System.in);
		// take the data from the user
		System.out.print("\n Enter the principle [P] : ");
		principle = input.nextInt();
		System.out.print("\n Enter the rate [R] : ");
		rate = input.nextInt();
		System.out.print("\n Enter the time [I] : ");
		time = input.nextInt();

		// calculate the interest
		interest = (principle * rate * time)/100;
		// print the result
		System.out.println("\n Simple Interest : " + interest);
		input.close();
	}
}
