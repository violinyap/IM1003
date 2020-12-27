import java.util.Scanner;

public class TriangularNumberPattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;

		System.out.print("Enter the size: ");
		n = in.nextInt();

		for(int i=0;i<n;i++){
			for(int j=0; j<i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}