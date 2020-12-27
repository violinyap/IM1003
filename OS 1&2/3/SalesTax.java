import java.util.Scanner;
public class SalesTax {
	public static void main(String[] args) {
		double taxin;
		double actprice, tax;
		double totalp=0.0, totalact=0.0, totaltax=0.0;
		Scanner in = new Scanner(System.in);

		do {
			System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
			taxin = in.nextDouble();

			if(taxin != -1){
				totalp += taxin;

				actprice = 100.0/107.0 * taxin;
				totalact += actprice;

				tax = (double) taxin - actprice;
				totaltax += tax;

				System.out.printf("Actual Price is: $%.2f, Sales Tax is: $%.2f%n%n", actprice, tax);
			}

		} while (taxin != -1);
		
		System.out.printf("Total Price is: $%.2f%n", totalp);
		System.out.printf("Total Actual Price is: $%.2f%n", totalact);
		System.out.printf("Total Sales Tax is: $%.2f%n", totaltax);

		in.close();
	}	
}