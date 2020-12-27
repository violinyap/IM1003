/*
	min max sum
*/
import java.util.Scanner;

public class SumProductMinMax5 {
	public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		int sum, product, min, max;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter 1st integer: ");
		num1 = in.nextInt();

		System.out.print("Enter 2nd integer: ");
		num2 = in.nextInt();

		System.out.print("Enter 3rd integer: ");
		num3 = in.nextInt();

		System.out.print("Enter 4th integer: ");
		num4 = in.nextInt();

		System.out.print("Enter 5th integer: ");
		num5 = in.nextInt();

		sum = num1 + num2 + num3 + num4 + num5; 
		System.out.println("The sum is: " + sum);

		product = num1*num2*num3*num4*num5;
		System.out.println("The product is: " + product);

		min = num1;
		if (num2 < min) {
			min = num2;
		} 
		if (num3 < min) {
			min = num3;
		}
		if (num4 < min) {
			min = num4;
		}
		if (num5 < min) {
			min = num5;
		}

		System.out.println("The min is: " + min);

		max = num1;
		if (num2 > max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		if (num4 > max) {
			max = num4;
		}
		if (num5 > max) {
			max = num5;
		}
		System.out.println("The max is: " + max);
	}
}