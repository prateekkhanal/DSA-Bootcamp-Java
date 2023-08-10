import java.util.Scanner;

public class AddNNumbers {
	public static void main(String[] args) {
		int sum=0;
		char stop;
		// create the scanner object
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("\n Enter the operand [n] : ");
			sum += input.nextInt();
			System.out.print("\n Exit [x] ? ");
			stop = input.next().charAt(0);
			if (stop == 'x') break;
		}
		System.out.println("\n Total sum = " + sum);
		input.close();
	}
}
