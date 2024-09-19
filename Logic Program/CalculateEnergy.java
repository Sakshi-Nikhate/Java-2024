import java.util.Scanner;

public class CalculateEnergy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		System.out.print("Enter the amount of water in kilograms: ");
		double kilograms = sc.nextDouble();
	 
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = sc.nextDouble();
		 
		System.out.print("Enter the final temperature: ");
		double finalTemperature = sc.nextDouble();

		double energy = kilograms * (finalTemperature - initialTemperature) * 4184;

		System.out.println("The energy needed is " + energy);
	}
}
