/*
	min max sum
*/
import java.util.Scanner;

public class SumProductMinMax3 {
	public static void main(String[] args) {
		int num1, num2, num3;
		int sum, product, min, max;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter 1st integer: ");
		num1 = in.nextInt();

		System.out.print("Enter 2nd integer: ");
		num2 = in.nextInt();

		System.out.print("Enter 3rd integer: ");
		num3 = in.nextInt();

		sum = num1 + num2 + num3;
		System.out.println("The sum is: " + sum);

		product = num1*num2*num3;
		System.out.println("The product is: " + product);

		min = num1;
		if (num2 < min) {
			min = num2;
		}
		if (num3 < min) {
			min = num3;
		}

		System.out.println("The min is: " + min);

		max = num1;
		if (num2 > max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}

		System.out.println("The max is: " + max);
	}
}