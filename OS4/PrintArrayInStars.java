import java.util.Scanner;

public class PrintArrayInStars {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numItems;
		int[] items;


		System.out.print("Enter the number of items: ");
		numItems = in.nextInt();

		int now;

		items = new int[numItems];

		if(numItems>0){
			System.out.println("Enter the value of all items (separated by space): ");
			for(int i=0;i<numItems;i++){
				now = in.nextInt();
				items[i] = now;
			}

			for(int i=0;i<numItems;i++){
				now=items[i];

				System.out.print(i+ ": ");
				for(int j=0;j<now;j++){
					System.out.print("*");
				}
				System.out.println("("+now+")");
			}

		}

	
		

		
	}
}