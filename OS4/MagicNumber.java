import java.util.Scanner;

public class MagicNumber {
	public static boolean isMagic(int number){
		int digit;
		
		while(number>0){
			digit=number%10;
			number/=10;

			if(digit==8){
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;

		System.out.print("Enter a positive integer: ");
		num = in.nextInt();

		if (isMagic(num)){
			System.out.println(num+" is a magic number");
		}else{
			System.out.println(num+" is not a magic number");
		}
	}
}