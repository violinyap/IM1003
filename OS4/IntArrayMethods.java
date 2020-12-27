import java.util.Scanner;

public class IntArrayMethods{
	public static void main(String[] args){
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
		System.out.println("The min is: " + min(items));
		System.out.println("The max is: " + max(items));
		System.out.println("The sum is: " + sum(items));
		System.out.printf("The average (rounded to 2 decimal places) is: %.2f%n" , average(items));
		if(isEmpty(items)){
			System.out.println("This array is empty");
		}else{
			System.out.println("This array is not empty");
		}
	}

	public static void print(int[] array){
			System.out.print("The values are: [");
			int now;
		for(int i=0;i<array.length;i++){
			now=array[i];

			if(i==0){
				System.out.print(now);
			}else{
				System.out.print(", "+ now);	
			}
		}
		System.out.println("]");
	}
	     // print [x1, x2, ..., xn]
	public static int min(int[] array){
			int now;
			int mini=array[0];
		for(int i=1;i<array.length;i++){
			now=array[i];

			if(now<mini)mini=now;
		}

		return mini;
	}         // Returns the minimum
	public static int max(int[] array){
		int now;
			int maxi=array[0];
		for(int i=1;i<array.length;i++){
			now=array[i];

			if(now>maxi)maxi=now;
		}

		return maxi;
	}         // Returns the maximum

	public static int sum(int[] array) {
		int now;
		int sum=0;
		for(int i=0;i<array.length;i++){
			now=array[i];
			sum+=now;
		}

		return sum;
	}         // Returns the sum
	public static double average(int[] array){
		return (double) sum(array)/array.length;
	} // Returns the average in double

	public static boolean isEmpty(int[] array){
		if (array.length ==0) return true;
		return false;
	} // Returns true if array's length is 0
}