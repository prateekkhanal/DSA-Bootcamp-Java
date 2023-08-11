// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class GreetUser {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);

		// input the username
		System.out.print("\n Enter your name : ");
		String username = input.nextLine();

		// greet the user
		System.out.print("\n Hello, " + username + "!\n");
		input.close();
	}
}
