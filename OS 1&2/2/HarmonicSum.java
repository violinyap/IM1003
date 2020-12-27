/*	
	Harmonic sum
*/
import java.util.Scanner;

public class HarmonicSum {
	public static void main(String[] args) {
		
		int maxDenominator;
		Scanner in = new Scanner(System.in);
		double sumL2R = 0.0;
		double sumR2L = 0.0;
		double absDiff;

		System.out.print("Enter the max denominator: ");
		maxDenominator = in.nextInt();
		for(int denominator = 1 ; denominator <= maxDenominator ; denominator++){
			sumL2R += (double) 1/denominator;
		}

		System.out.println("The sum from left-to-right is: " + sumL2R);

		for(int denominator = maxDenominator ; denominator >= 1; denominator--){
			sumR2L += (double) 1/denominator;
		}

		System.out.println("The sum from right-to-left is: " + sumR2L);

		if(sumL2R > sumR2L){
			absDiff = sumL2R - sumR2L;
		} else {
			absDiff = sumR2L - sumL2R;
		}

		System.out.println("The absolute difference is: "+ absDiff);
	}
}