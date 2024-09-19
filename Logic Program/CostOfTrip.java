import java.util.Scanner;
class CostOfTrip {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the driving distace: ");
		double distace = sc.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = sc.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = sc.nextDouble();

		double costOfDriving = (distace / milesPerGallon) * pricePerGallon;

		System.out.println("The cost of driving is $" + costOfDriving);
	}
}
