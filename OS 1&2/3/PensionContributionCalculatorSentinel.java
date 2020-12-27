import java.util.Scanner;

public class PensionContributionCalculatorSentinel {
	public static void main(String[] args) {
		int monthSalary, age;
		double eecont, ercont;
		Scanner in = new Scanner(System.in);

		do{
			System.out.print("Enter the monthly salary (or -1 to end): $");
			monthSalary = in.nextInt();

			if(monthSalary == -1 ){
				System.out.println("bye!");
			}else {
				
			System.out.print("Enter the age: ");
			age = in.nextInt();

			if(monthSalary > 6000){
				monthSalary = 6000;
			}

			if (age <= 55) {
				eecont = 0.2 * monthSalary;
				ercont = 0.17 * monthSalary;
			} else
			if (age <= 60){
				eecont = 0.13 * monthSalary;
				ercont = 0.13 * monthSalary;
			} else
			if (age <= 65){
				eecont = 0.075 * monthSalary;
				ercont = 0.09 * monthSalary;
			} else {
				eecont = 0.05 * monthSalary;
				ercont = 0.075 * monthSalary;
			}

			System.out.printf("The employee's contribution is: $%.2f%n", eecont);
			System.out.printf("The employer's contribution is: $%.2f%n", ercont);
			System.out.printf("The total contribution is: $%.2f%n", (eecont+ercont));
			}
		}
		while (monthSalary!= -1);
	}
}