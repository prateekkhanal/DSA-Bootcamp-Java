// program to find the area of a triangle

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		// create a scanner object
		Scanner input = new Scanner(System.in);

		// decide the type of the triangle (Scalene, Isosceles, Equilateral)
		System.out.println("\n Describe the type of Triangle : ");
		System.out.println("\t 1. Scalene");
		System.out.println("\t 2. Isosceles");
		System.out.println("\t 1. Equilateral");
		System.out.print("\n Enter the option [1-3] : ");
		int option = input.nextInt();

		// use the appropriate formula to print the area of the triangle based on the option number
		float a, b, c, areaOfTriangle; 
		System.out.print("\n Enter the length of the sides of the triangle : ");
		switch (option) {
			case 1 : a = input.nextInt();
				b = input.nextInt();
				c = input.nextInt();
				float semiPerimeter = (a+b+c)/2;
				areaOfTriangle = (float)(Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c)));
				break;
			case 2 :  a = input.nextInt();
				b = input.nextInt();
				areaOfTriangle = 0.5f * (a * b);
				break;
			case 3 :  a = input.nextInt();
				areaOfTriangle = (float)(Math.pow(a,2) * (Math.sqrt(3)/4));
				break;
			default:
				System.out.println("\n Invalid input!!!\n");
				areaOfTriangle = 0;
				System.exit(1);
		}
		
		// print the area of the triangle
		System.out.println("\n Area of the Triangle : " + areaOfTriangle + "sq. units\n");

		input.close();
	}
}

