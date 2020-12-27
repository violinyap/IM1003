import java.util.Scanner;

public class TimesTable {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;

		System.out.print("Enter the size of the table: ");
		n = in.nextInt();

		System.out.print(" * |");
		for(int i=1;i<=n;i++){
				int temp = i;
				int num=0;
				while(temp>0){
					temp/=10;
					num++;
				}

				for(int k=num;k<4;k++){
					System.out.print(" ");
				}
				System.out.print(i);

		}	
		System.out.println();

		System.out.print("===+");
		for(int i=1;i<=n*4;i++){
			System.out.print("=");
		}
		System.out.println();

		for(int i=1;i<=n;i++){
			System.out.print(" "+i+" |");
			for(int j=1;j<=n;j++){
				int temp = i*j;
				int num=0;
				while(temp>0){
					temp/=10;
					num++;
				}

				for(int k=num;k<4;k++){
					System.out.print(" ");
				}
				System.out.print(i*j);
			}
			System.out.println();
		}
	}
}