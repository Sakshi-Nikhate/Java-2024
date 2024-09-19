import java.util.Scanner;
public class SumOfPrime2 {
      public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number: ");
        int num1 = sc.nextInt();
        int sum = 0;

        while (num1>0) 
        {
             int rem = num1%10;
             
             int num = rem;
             boolean flag = true;
             if (num<2)
              {
                flag = false;
                
                for(int i=2;i<num;i++)     
                  if (num%i==0) 
                  {
                     flag = false;
                     break; 
                  }

                  if(flag)
                   {
                    sum +=rem;

                    num1/=10;
                  }
                  System.out.println(sum);
            }
        }
      }
    }

