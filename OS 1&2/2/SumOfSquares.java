/*
	sum of squares
*/

public class SumOfSquares {
	public static void main(String[] args) {
		// sum squares
		int sum = 0;
		int lowerbound = 1;
		int upperbound = 100;

		for(int number = lowerbound; number <= upperbound; number++){
			sum += number*number;
		}

		System.out.println("The sum of squares from 1 to 100 is " + sum);

		//sum odd even
		int sumOdd = 0;
		int sumEven = 0;
		int absDiff;

		for (int number = lowerbound; number <= upperbound; number++){
			if (number%2==0){
				sumEven+=number;
			} else {
				sumOdd+=number;
			}
		}

		if (sumOdd > sumEven){
			absDiff = sumOdd - sumEven;
		} else {
			absDiff = sumEven - sumOdd;
		}

		absDiff = (sumOdd>sumEven) ? (absDiff = sumOdd - sumEven) : (absDiff = sumEven - sumOdd);

		System.out.println("The sum of odd number is " + sumOdd);
		System.out.println("The sum of even number is " + sumEven);
		System.out.println("The absolute difference is " + absDiff);
	}
}