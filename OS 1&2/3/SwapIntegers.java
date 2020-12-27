import java.util.Scanner;

public class SwapIntegers {
	public static void main(String[] args) {
		int num1, num2;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		num1 = in.nextInt();

		System.out.print("Enter second integer: ");
		num2 = in.nextInt();

		int temp;
		temp=num1;
		num1=num2; 
		num2=temp;

		System.out.println("After the swap, first integer is: "+ num1 + ", second integer is: " +num2);
	}
}