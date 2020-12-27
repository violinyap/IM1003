import java.util.Scanner;

public class OddEven {
	public static boolean isOdd(int number){
		if (number<0) number*=-1;
		if (number%2==1) return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num;
		System.out.println("Enter a number: ");
		num= in.nextInt();

		boolean flag = isOdd(num);

		if(flag){
			System.out.println(num + " is an odd number");
		}else{
			System.out.println(num + " is an even number");
		}
	}
}