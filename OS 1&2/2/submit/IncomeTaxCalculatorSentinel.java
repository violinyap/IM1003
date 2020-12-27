import java.util.Scanner;

public class IncomeTaxCalculatorSentinel {
	public static void main(String[] args) {
		final double TAX_RATE_ABOVE_20K = 0.1; //constant
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;
		final int SENTINEL = -1;

		int taxableIncome;
		double taxPayable;
		Scanner in = new Scanner(System.in);

		do {
			System.out.print("Enter the taxable income (or -1 to end): $");
			taxableIncome = in.nextInt();

			if (taxableIncome == -1){
				System.out.println("bye!");
			} else{
				if (taxableIncome <= 20000){
					taxPayable = 0.0;
				}else
				if (taxableIncome <= 40000){
					taxPayable = (taxableIncome-20000) * TAX_RATE_ABOVE_20K;
				}else
				if (taxableIncome <= 60000){
					taxPayable = 2000 + (taxableIncome-40000) * TAX_RATE_ABOVE_40K;
				}else {
					taxPayable = 6000 + (taxableIncome-60000) * TAX_RATE_ABOVE_60K;
				}

				System.out.printf("The income tax payable is: $%.2f%n", taxPayable);		
			}
			
		} while (taxableIncome!=-1);
		
	}
}