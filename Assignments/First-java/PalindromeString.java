// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);
		// take the String input from the user
		System.out.print("\n Enter the String : ");
		String string = input.nextLine();
		boolean isPalindrome = true;	// set the initial assumption as palindrome

		// start comparing the characters from first and last and slowly move towards the middle
		for (int front=0, rear=string.length()-1; front != 2; front++, rear--) {
			if (string.charAt(front) != string.charAt(rear)) {
				isPalindrome = false;	// if the characters are not the same, then the string is the not palindrome
				break;
			}
		}

		System.out.printf("\n %s, '" + string + "' %s a Palindrome!\n\n", (isPalindrome) ? "YES" : "NO", (isPalindrome) ? "IS" : "is NOT");
		input.close();
	}
}
