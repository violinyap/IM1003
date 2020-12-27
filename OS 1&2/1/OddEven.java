/*
	input output
*/

import java.util.Scanner; // for keyboard input

public class OddEven {
	public static void main(String[] args) {
		int numberIn;
		Scanner in = new Scanner(System.in); // scan keyboard for input

		System.out.print("Enter an integer: ");
		numberIn = in.nextInt();

		if(numberIn < 0){
			if ((numberIn*-1) % 2 == 1){
			System.out.println(numberIn + " is odd");
			} else {
				System.out.println(numberIn + " is even");
			}
		} else{
			
			if (numberIn % 2 == 1){
				System.out.println(numberIn + " is odd");
			} else {
				System.out.println(numberIn + " is even");
			}	
		}

		System.out.println("bye");

		in.close(); // close scanner
	}
}