import java.util.Scanner;
class PositiveNegative {
   public static void main(String[] args) {
       Scanner Sc = new Scanner (System.in);
       System.out.println("Enter a Number: ");
       int num = Sc.nextInt();
       
       if(num>0){
           System.out.println("The Number is POSITIVE");
       }
       else if (num<0){
           System.out.println("The Number is NEGATIVE");
       }
       }
   }
