/*
	print digits reversed
*/

public class ExtractDigits {
	public static void main(String[] args) {
		int number= 15423;

		while (number > 0){
			int digit = number%10;
			System.out.print(digit + " ");
			number /= 10;
		}
	}
}