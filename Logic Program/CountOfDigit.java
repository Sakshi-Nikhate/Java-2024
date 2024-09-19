import java.util.Scanner;
public class CountOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num : ");
        int num =sc.nextInt();
        int count = 0;
        
        for (int i=num ;i>0 ;i/=10);
             count++;
             System.out.println(num+" : "+count);
    }
}
