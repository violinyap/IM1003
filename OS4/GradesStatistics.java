import java.util.Scanner;

public class GradesStatistics {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] grades;
		int numStud;

		System.out.print("Enter the number of students: ");
		numStud = in.nextInt();

		grades = new int[numStud];

		int grade;
		double sum=0;
		double avg;
		int mini=-1, maxi=-1;
		for(int i=0;i<numStud;i++){
			System.out.print("Enter the grade for student "+ (int)(i+1) + ": ");
			grade = in.nextInt();
			grades[i]= grade;
			if(i==0){
				mini=grade;
				maxi=grade;
			}else{
				if(grade<mini)mini=grade;
				if(grade>maxi)maxi=grade;
			}
			sum+=grade;
		}

		avg=sum/numStud;

		System.out.printf("The average is: %.2f%n", avg);
		System.out.println("The minimum is: " + mini);
		System.out.println("The maximum is: " + maxi);
	}
}