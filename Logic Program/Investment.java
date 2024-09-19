import java.util.Scanner;
public class Investment  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		final double MONTHLY_INTEREST_RATE = 0.00417;	 

		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = sc.nextDouble();

		double total = 100 * (1 + MONTHLY_INTEREST_RATE);

		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);

		System.out.println("After the sixth month, the account value is " + total);
	}
}
