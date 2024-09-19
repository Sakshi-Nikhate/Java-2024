import java.util.Scanner;
public class Factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valuec: ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = num;i>0;i--)
           fact *=i;
           System.out.println("Factorial of "+ num+" is : "+ fact);
    }
    
}
