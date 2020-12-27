import java.util.Scanner;

public class Oct2Dec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inStr;
		int len;
		char now;

		System.out.print("Enter an octal string: ");
		inStr = in.next();
		len = inStr.length();

		int num=0;
		int octNow=1;

		for(int i=len-1;i>=0;i--){
			now=inStr.charAt(i);

			
			num+=octNow*(now-'0');
			
			octNow*=8;
		}

		if(num!=0){
		System.out.println("The decimal equivalent is: " + num);
		}
		else{
			System.out.println("The decimal equivalent is: 0");	
		}
	}
}