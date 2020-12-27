/*
	Factorial
*/

import java.util.Scanner;

public class Factorial{
	public static void main(String[] args) {
		int n;
		int fact=1;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		n = in.nextInt();

		for(int i=1; i<=n; i++){
			fact*=i;
		}

		System.out.println("The Factorial of " + n + " is: " + fact);
	}
}