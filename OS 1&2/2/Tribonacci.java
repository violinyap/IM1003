/*
	tribonacci
*/

public class Tribonacci {
	public static void main(String[] args) {
		int tn;
		int n=4;
		int tnmin1=1,tnmin2=1,tnmin3=2;
		int nMax = 20;

		System.out.print("The first "+ nMax + "tribonacci numbers are ");
		System.out.print(tnmin1 + ", " + tnmin2 + ", " + tnmin3);
		while(n<=nMax){
			tn=tnmin3+tnmin2+tnmin1;

			System.out.print(", " + tn);

			n++;
			tnmin3 = tnmin2;
			tnmin2 = tnmin1;
			tnmin1 = tn;
		}

	}
}