import java.util.Scanner;

public class PalindromicWordTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inStr;
		int len;
		char now;

		System.out.print("Enter a String: ");
		inStr = in.next();
		len = inStr.length();

		String temp= inStr.toLowerCase();

		boolean flag = true;

		int idx=0;
		char compa, compb;
		while(idx<=len/2 && flag){
			compa= temp.charAt(idx);
			compb= temp.charAt(len-1-idx);

			if(compa!=compb){
				flag=false;
			}
			idx++;
		}

		
		if(flag){
			System.out.println("\""+ inStr +"\""+ " is palindromic");
		}
		else{
			System.out.println("\""+ inStr +"\""+ " is not palindromic");
		}
	}
}