import java.util.Scanner;

public class CaesarCode {
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
			now = inStr.charAt(i);
			temp = (char)(now +  3);

			if(temp>'Z'){
				temp-='Z';
				temp+='A'-1;
				
			}
			

			System.out.print((char)temp);
		}

		System.out.println();
	}
}