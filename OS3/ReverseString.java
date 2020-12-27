import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String instr;
		int strlen;

		System.out.print("Enter a String: ");
		instr = in.next();
		strlen = instr.length();

		System.out.print("The reverse is: ");
		for(int i=strlen-1 ; i>=0;i--){
			System.out.print(instr.charAt(i));
		}	
		System.out.println();
	}
}