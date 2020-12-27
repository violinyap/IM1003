import java.util.Scanner;

public class CylinderComputation {
	public static void main(String[] args) {
		double radius,height,volume, base,area;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		radius = in.nextDouble();

		System.out.print("Enter the height: ");
		radius = in.nextDouble();
		
		base = Math.PI * radius * radius;
		area = 2.0 * Math.PI * radius * height + 2.0 * base;
		volume = base * height;

		// %.2f = 2 decimal digits, %n newline
		System.out.printf("Base Area is: %.2f%n", base);
		System.out.printf("Surface Area is: %.2f%n", area);
		System.out.printf("Volume is: %.2f%n", volume);
		
	}
}