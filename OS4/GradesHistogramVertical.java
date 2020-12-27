import java.util.Scanner;

public class GradesHistogramVertical {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] grades;
		int numStud;

		System.out.print("Enter the number of students: ");
		numStud = in.nextInt();

		grades = new int[10];

		int grade;
		int maxi=0;
		int now;
		for(int i=0;i<numStud;i++){
			System.out.print("Enter the grade for student "+ (int)(i+1) + ": ");
			grade = in.nextInt();
			
			if(grade!=100){
				grades[grade/10]++;
				now=grades[grade/10];
			}else{
				grades[9]++;
				now=grades[9];
			}
			if(now>maxi)maxi=now;
			
		}

	for(int row=maxi;row>0;row--){
		for(int i=0;i<10;i++){
			if(grades[i]>=row){
				System.out.print("   *   ");
			}else{
				System.out.print("       ");
			}
		}	
		System.out.println();
	}

	
		for(int i=0;i<10;i++){
			int low= i*10;
			int up=low+9;
			if(up==99) up++;

			 System.out.printf("%3d-%-3d", low, up);
		}
		System.out.println();
	}
}