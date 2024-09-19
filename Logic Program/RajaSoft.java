import java.util.Scanner;
public class RajaSoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();  //4
        int prevPrime = 0;      //3
        int nextPrime = 0;     //5

        for (int i=2 ;  ; i++ ){
            int num2 =i;  //4
            boolean flag = true;
            for(int j=2;j<num2;j++){
                if(num2%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                if(num2<num){
                    prevPrime = num2;
                }
                else if (num<i)
                {
                    nextPrime = num2;
                    break;
                }
            }
            }
             if(num-prevPrime < nextPrime-num)
                System.out.println(prevPrime+" "+num);
             else if(num-prevPrime > nextPrime-num)
                System.out.println(num+" "+nextPrime);
             else
                System.out.println(prevPrime+" "+num+" "+ nextPrime);   
        }
    }

