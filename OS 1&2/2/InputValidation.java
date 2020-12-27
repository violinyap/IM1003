
import java.util.Scanner;

public class InputValidation {
	public static void main(String[] args) {
		int number=0;
		boolean flag=false;
		Scanner in = new Scanner(System.in);

		while (!flag){
			System.out.print("Enter a number between 0-10 or 90-100: ");
			number = in.nextInt();	

			if(number>= 0 && number<=10) flag = true;
			if(number>=90 && number <=100) flag = true;

			if(!flag){
				System.out.println("Invalid input, try again...");
			}
		}

		System.out.println("You have entered: " + number);
		
	}
}