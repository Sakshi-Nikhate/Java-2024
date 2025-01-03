import java.util.Scanner;
public class Armstrong2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter a num : ");
      int num = sc.nextInt();
         
         int dup = num;
         int a , sum= 0 ;

         while(num>0)
         {
            a = num%10;
            num = num/10;
            sum = sum + a*a*a*a;
         }
         if(dup == sum)
            System.out.println("It's an Armstrong Number");
         else
            System.out.println(" It is not an  Armstrong Number");
        }
    }     