/*
	print digits reversed
*/

import java.util.Scanner;

public class ReverseInt {
	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		number = in.nextInt();

		System.out.print("The reverse is: ");
		int sum = 0;
		while (number > 0){
			int digit = number%10;
			number /= 10;
			
			System.out.print(digit);
		}

		System.out.println();
	}
}