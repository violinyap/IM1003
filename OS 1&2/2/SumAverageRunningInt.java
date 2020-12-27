/*
	sum and average
*/

public class SumAverageRunningInt {
	public static void main(String[] args) {
		int sum = 0;
		double average;
		int lowerbound = 111;
		int upperbound = 8899;
		int count = 0;

		//for
		for(int number = lowerbound; number <= upperbound; ++number) {
			sum+=number;
			count++;
		}

		average=(double) sum/count;

		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + average);

		//while-do

		sum = 0;
		count = 0;
		int number = lowerbound;
		while(number <= upperbound){
			sum+=number++;
			count++;
		}

		average=(double) sum/count;

		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + average);
		
		// do-while

		sum = 0;
		count = 0;
		number = lowerbound;
		do{
			sum+=number++;
			count++;
		}while (number <= upperbound);

		average=(double) sum/count;

		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + average);
		
	}
}