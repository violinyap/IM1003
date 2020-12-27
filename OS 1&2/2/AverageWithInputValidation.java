
import java.util.Scanner;

public class AverageWithInputValidation {
	public static void main(String[] args) {
		int mark1=0,mark2=0,mark3=0;
		boolean flag=false;
		Scanner in = new Scanner(System.in);

		while (!flag){
			
			System.out.print("Enter the mark (0-100) for student 1: ");
			mark1 = in.nextInt();	
			if(mark1>= 0 && mark1<=100) flag = true;

			if(!flag){
				System.out.println("Invalid input, try again...");
			}
		}

		flag= false;
		while (!flag){
			
			System.out.print("Enter the mark (0-100) for student 2: ");
			mark2 = in.nextInt();	
			if(mark2>= 0 && mark2<=100) flag = true;

			if(!flag){
				System.out.println("Invalid input, try again...");
			}
		}

		flag = false;
		while (!flag){
			
			System.out.print("Enter the mark (0-100) for student 3: ");
			mark3 = in.nextInt();	
			if(mark3>= 0 && mark3<=100) flag = true;

			if(!flag){
				System.out.println("Invalid input, try again...");
			}
		}

		double average = (mark1+mark2+mark3) / 3.0;
		System.out.printf("The average is: %.2f%n", average);
		
	}
}