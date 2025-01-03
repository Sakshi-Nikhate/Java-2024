import java.util.Scanner;
public class RecFactorial {
    static int num;
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    num = sc.nextInt();
    int result = factorial(num);
    System.out.println("Factorial of "+ num+ "is"+ result);
    }
public static int factorial(int num){
   if(num==0 || num==1){
    return 1;
   }
   return num * factorial(num -1);
}
}

