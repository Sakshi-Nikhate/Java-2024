import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num2 = 2;
        
        int fact = 1;
        for(int i = num2;i>0;i--)
           fact *=i;
           System.out.println("Factorial of "+ num2+" is : "+ fact);
    }
}
