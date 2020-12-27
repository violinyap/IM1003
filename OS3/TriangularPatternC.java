import java.util.Scanner;

public class TriangularPatternC {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;

		System.out.print("Enter the size: ");
		n = in.nextInt();

		for(int i = 0;i<n;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}

			for(int j=i;j<n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}