/*
	input output
*/

import java.util.Scanner; // for keyboard input

public class Add2Integers {
	public static void main(String[] args) {
		int number1, number2, sum;
		Scanner in = new Scanner(System.in); // scan keyboard for input

		System.out.print("Enter first integer: ");
		number1 = in.nextInt();

		System.out.print("Enter second integer: ");
		number2 = in.nextInt();

		sum = number1 + number2;

		System.out.println("The sum is: " + sum);

		in.close(); // close scanner
	}
}