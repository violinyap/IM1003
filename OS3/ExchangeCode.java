import java.util.Scanner;

public class ExchangeCode {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inStr;
		int len;
		char now,temp;

		System.out.print("Enter a plaintext string: ");
		inStr = in.next().toUpperCase();
		len = inStr.length();

		System.out.print("The ciphertext string is: ");

		for(int i=0;i<len;i++){
			now= inStr.charAt(i);
			temp = (char) ('Z' - now + 'A');
			System.out.print(temp);
		}
	}
}