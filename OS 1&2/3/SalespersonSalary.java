import java.util.Scanner;

public class SalespersonSalary {
	public static void main(String[] args) {
		int sales;
		double salary;
		Scanner in = new Scanner(System.in);

		do {
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales = in.nextInt();
			salary = 1000.0;
			if (sales == -1){
				System.out.println("bye");
			} else{
				salary+=0.15*sales;
				System.out.printf("Salary is: $%.2f%n%n", salary);
			}
			
			
		} while (sales!=-1);
		
	}
}