/*
	compute value of pi (series)
*/

import java.util.Scanner;

public class ComputePIa {
	public static void main(String[] args) {
		double sum = 0.0;
		int maxDenominator;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the maximum denominator: ");
		maxDenominator = in.nextInt();

		for(int denominator = 1; denominator<=maxDenominator; denominator+=2){
			if (denominator % 4 == 1){
				sum += (double) 1/denominator;
			} else
			if (denominator % 4 == 3){
				sum -= (double) 1/denominator;
			} else {
				System.out.println("Impossible!!!");
			}
		}
		
		sum *= 4.0;
		System.out.printf("The PI computed is: %.10f%n", sum);

		//using term as limit
	}
}