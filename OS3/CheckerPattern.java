/*
Pattern
*/

import java.util.Scanner;

public class CheckerPattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;

		System.out.print("Enter the size: ");
		n = in.nextInt();

		for(int i = 0; i<n; i++ ){
			if(i%2==1){
				System.out.print(" ");
			}
			for(int j = 0;j < n; j++){
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}