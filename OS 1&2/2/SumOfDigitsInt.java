/*
	print digits reversed
*/

import java.util.Scanner;

public class SumOfDigitsInt {
	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		number = in.nextInt();

		int sum =0;
		while (number > 0){
			int digit = number%10;
			sum+= digit;
			number /= 10;
		}

		System.out.println("The sum of all digits is: "+ sum);
	}
}