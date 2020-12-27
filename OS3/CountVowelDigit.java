import java.util.Scanner;

public class CountVowelDigit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inStr;
		int len;
		char now;
		int vow=0,dig=0;

		System.out.print("Enter a String: ");
		inStr = in.next().toLowerCase();
		len=inStr.length();

		for(int i=0;i<len;i++){
			now=inStr.charAt(i);

			switch (now){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vow++;
					break;
			}

			if(now>= '0' && now<='9'){
				dig++;
			}
		}

		double perv,perd;
		perv= (double) vow*100.0/len;
		perd= (double) dig*100.0/len;

		System.out.printf("Number of vowels is: %d (%.2f%%)%n",vow,perv);
		System.out.printf("Number of digits is: %d (%.2f%%)%n",dig,perd);
	}
}