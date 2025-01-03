import java.util.Scanner;
public class Factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=num;i++)
        {
      System.out.println(i);
        fact = fact*i;  
        }
      System.out.println("Factorial of "+ num +" is : "+ fact);
    }
}