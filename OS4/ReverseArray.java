import java.util.Scanner;

public class ReverseArray {
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
		print(items);
		reverse(items);

	}

	public static void print(int[] array){

		System.out.print("The original array is: [");

		for(int i=0;i<array.length;i++){
			int now=array[i];

			if(i==0){
				System.out.print(now);
			}else{
				System.out.print(", "+ now);	
			}
		}

		System.out.println("]");
	}
	public static void reverse(int[] array){
		
		System.out.print("The reverse is: [");

		for(int i=array.length-1;i>=0;i--){
			int now=array[i];

			if(i==0){
				System.out.print(now);
			}else{
				System.out.print( now+", ");	
			}
		}

		System.out.println("]");
	}
}