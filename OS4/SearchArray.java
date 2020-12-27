import java.util.Scanner;

public class SearchArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numItems;
		int[] items;


		System.out.print("Enter the number of items: ");
		numItems = in.nextInt();

		int now;

		items = new int[numItems];

		if(numItems>0){
			System.out.print("Enter the value of all items (separated by space): ");
			for(int i=0;i<numItems;i++){
				now = in.nextInt();
				items[i] = now;
			}
		}

		System.out.print("Enter the search key: ");
		now= in.nextInt();
		
		if(search(items,now)!=-1){
			System.out.println(now + " is found with index " + search(items,now));
		}else {
			System.out.println(now +" is not found");
		}
	}

	public static int search(int[] array, int key){
		for(int i=0;i<array.length;i++){
			if(array[i]==key)return i;
		}
		return -1;
	}
}