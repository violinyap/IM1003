import java.util.Scanner;

public class PrintArray {
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
		}

		System.out.print("The values are: [");

		for(int i=0;i<numItems;i++){
			now=items[i];

			if(i==0){
				System.out.print(now);
			}else{
				System.out.print(", "+ now);	
			}
		}

		System.out.println("]");
		

		
	}
}