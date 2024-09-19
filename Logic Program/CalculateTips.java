import java.util.Scanner;

public class CalculateTips {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	 

		System.out.print("Enter the subtotal : ");
			double subtotal = sc.nextDouble();
		System.out.print("Enter a gratuity rate: ");
     	double gratuityRate = sc.nextDouble();

		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;

		System.out.println("The gratuity is $" + gratuity +
			" and total is $" + total);
	}
}
