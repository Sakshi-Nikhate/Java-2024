import java.util.Scanner;

class Interest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter balance : ");
		float balance = sc.nextFloat();
	System.out.println("Enter the annual interest rate : ");
		float interest = sc.nextFloat();

System.out.println("The interest is :" + balance *(interest/1500));
                       
	}
}