import java.util.Scanner;

public class BoxCrossPattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;

		System.out.print("Enter the size: ");
		n = in.nextInt();

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==0|| i==n-1 || j==0 || j==n-1){
					System.out.print("*");
				}else
				if(i==j || i+j==n-1){
					System.out.print("+");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}