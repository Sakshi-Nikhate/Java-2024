 
import java.util.Scanner;
class WhileLoop2 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        String words =""; //four
        while(num>0)//120>0 true
        {
            int rem = num%10; //1234%10 - 3
            switch(rem)
            {
                case 1: words = "ONE" + words ; break;
                case 2: words = "TWO" + words ; break;
                case 3: words = "THREE" + words ; break;
                case 4: words = "FOUR" + words ; break;
                case 5: words = "FIVE" + words ; break;
                case 6: words = "SIX" + words ; break;
                case 7: words = "SEVEN" + words ; break;
                case 8: words = "EIGHT" + words ; break;
                case 9: words = "NINE" + words ; break;
                case 0: words = "TEN" + words ; break;
            }
            num/=10; //123/10-123\
        }
        System.out.println(words);
    }
}
