import java.util.Scanner;

public class GradesHistogramHorizontal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] grades;
		int numStud;

		System.out.print("Enter the number of students: ");
		numStud = in.nextInt();

		grades = new int[10];

		int grade;

		for(int i=0;i<numStud;i++){
			System.out.print("Enter the grade for student "+ (int)(i+1) + ": ");
			grade = in.nextInt();
			
			if(grade!=100){
				grades[grade/10]++;
			}else{
				grades[9]++;
			}
		}

		for(int i=0;i<10;i++){
			int low= i*10;
			int up=low+9;
			if(up==99) up++;


			 System.out.printf("%2d-%3d: ", low, up);

			 for(int j=0;j<grades[i];j++){
			 	System.out.print("*");
			 }
			 System.out.println();
		}
	}
}