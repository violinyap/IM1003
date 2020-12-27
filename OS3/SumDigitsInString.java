import java.util.Scanner;

public class SumDigitsInString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inStr;
		int len,tmp,sum=0;
		char now;

		System.out.print("Enter a String: ");
		inStr = in.next().toUpperCase();
		len = inStr.length();

		for(int i=0;i<len;i++){
			now = inStr.charAt(i);

			if(now>='0' && now<='9'){
				tmp = now - '0';
				sum+=tmp;
			}
		}

		System.out.println("The sum of all digits is: "+ sum);
	}
}