import java.util.Scanner;

public class HillPattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;

		System.out.print("Enter the rows: ");
		n = in.nextInt();

		for(int i=0; i<n;i++){
			for(int j=1;j<n;j++){
				if(i+j>=n){
					System.out.print("^");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("^");
			for(int j=1;j<n;j++){
				if(j<=i){
					System.out.print("^");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}