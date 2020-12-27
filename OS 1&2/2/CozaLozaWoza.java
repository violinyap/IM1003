/*
	print conditional
*/

public class CozaLozaWoza {
	public static void main(String[] args) {
		int lowerbound = 1;
		int upperbound = 110;

		for(int number = lowerbound; number <= upperbound; number++){
			boolean flag = false;

			if(number % 3 == 0){
				System.out.print("Coza");
				flag = true;
			}
			if(number % 5 == 0){
				System.out.print("Loza");
				flag = true;
			}
			if(number % 7 == 0){
				System.out.print("Woza");
				flag = true;
			}

			if (!flag) { 
				System.out.print(number);
			}
			System.out.print(" ");

			if(number % 11 == 0){
				System.out.println("");
			}
		}
	}
}