/*
	compute value of pi (series)
*/

public class ComputePI {
	public static void main(String[] args) {
		double sum = 0.0;
		int maxDenominator = 1000000;

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
		System.out.println("The estimated value of PI is "+ sum);

		//using term as limit

		int maxTerm = 10000;
		sum = 0.0;

		for(int term = 1; term <= maxTerm; term++)	{
			if(term % 2 == 1){
				sum += (double) 1 / (term*2 - 1);
			} else {
				sum -= (double) 1 / (term*2 - 1);
			}
		}

		sum *= 4.0;
		System.out.println("The estimated value of PI is "+ sum);

		System.out.println("The value of PI in jdk is "+ Math.PI);
	}
}