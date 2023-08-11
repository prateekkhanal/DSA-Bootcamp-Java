// input currency in nepalese rupees and convert it to USD
import java.util.Scanner;

public class RupeesToUSD {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);
		// take the rupees value
		System.out.print("\n Enter the Nepalese Rupees [NRS.] = ");
		float nrs = input.nextFloat();
		float usd = (float)132.5*nrs;
		System.out.print("\n NRS " + nrs + " = USD " + usd + "\n");
		input.close();
	}
}
