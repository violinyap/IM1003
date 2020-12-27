import java.util.Scanner;

public class SphereComputation {
	public static void main(String[] args) {
		double radius,volume, area;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		radius = in.nextDouble();

		
		area = 4.0 * Math.PI * radius * radius;
		volume = 4.0 / 3.0 * Math.PI * radius * radius * radius;

		// %.2f = 2 decimal digits, %n newline
		
		System.out.printf("Surface Area is: %.2f%n", area);
		System.out.printf("Volume is: %.2f%n", volume);
		
	}
}