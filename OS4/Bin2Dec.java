import java.util.Scanner;

public class Bin2Dec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inStr;
		int len;
		char now;

		System.out.print("Enter a binary string: ");
		inStr = in.next();
		len = inStr.length();

		int num=0;
		int binNow=1;

		for(int i=len-1;i>=0;i--){
			now=inStr.charAt(i);

			if(now=='1'){
				num+=binNow;
			}
			binNow*=2;
		}

		if(num!=0){
		System.out.println("The decimal equivalent is: " + num);
		}
		else{
			System.out.println("The decimal equivalent is: 0");	
		}
	}
}