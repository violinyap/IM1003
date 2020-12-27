/*
	computing factorial
*/

public class Product1ToN {
	public static void main(String[] args) {
		long product = 1;
		int lowerbound = 1;
		int upperbound = 20;

		for(int number = lowerbound; number <= upperbound; number++){
			product*=number;
		}

		System.out.println("The factorial of " + upperbound + " is " + product);
	}
}