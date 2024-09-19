import java.util.Scanner;

public class Cylinder {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);
		final double PI = 3.14;

		// Prompt user to enter the radius and length of a cylinder
		System.out.print("Enter the radius and height of a cylinder: ");
		double radius = sc.nextDouble();
		double height = sc.nextDouble();

		// Comput the area and volume 
		double area = radius * radius * PI;
		double volume = area * height;

		// Display results
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}
}
