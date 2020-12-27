/*
	sum and average
*/
import java.util.Scanner;

public class SumAverage {
	public static void main(String[] args) {
		int sum = 0;
		double average;
		int lowerbound;
		int upperbound;
		int count = 0;

		Scanner in = new Scanner(System.in);

		// read input
		System.out.print("Enter the lowerbound: ");
		lowerbound = in.nextInt();

		System.out.print("Enter the upperbound: ");
		upperbound = in.nextInt();
		
		//for
		for(int number = lowerbound; number <= upperbound; ++number) {
			sum+=number;
			count++;
		}

		average=(double) sum/count;

		// output result
		System.out.println("The sum is: " + sum);
		System.out.printf("The average is: %.2f%n", average);

	}
}