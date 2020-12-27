/*
	input output
*/

import java.util.Scanner; // for keyboard input

public class RectangleComputation {
	public static void main(String[] args) {
		int number1, number2, sum, product;
		Scanner in = new Scanner(System.in); // scan keyboard for input

		System.out.print("Enter the length: ");
		number1 = in.nextInt();

		System.out.print("Enter the width: ");
		number2 = in.nextInt();

		sum = number1 + number2;
		sum*=2;
		product = number2*number1;

		System.out.println("The perimeter is: " + sum);
		System.out.println("The area is: " + product);

		in.close(); // close scanner
	}
}