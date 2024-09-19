import java.util.Scanner;
public class OddDigit {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        int num = new Scanner (System.in).nextInt();
        String op ="";
        while(num<0)
        {
            int rem = num%10;
            if (rem % 2 = 0);
             op= rem+" "+op;
             num/=10;
        }
        System.out.println(op);
    }
}
