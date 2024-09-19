import java.util.Scanner;
class FactorsOfNumber{
	public static void main(String[] args) {
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Factore of "+ num + "is  : ");
		for (int i =1 ; i<=num ;i++)
		{
			if(num%i==0)
				System.out.println(i+" ");
		}
	}
}