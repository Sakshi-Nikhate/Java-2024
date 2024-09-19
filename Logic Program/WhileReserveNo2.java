import java.util.Scanner;
public class WhileReserveNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String words = " ";
        while( num>0);
        {
            int rem = num%10;
            switch (rem)
            {
                Case1: words = "ONE" + words ; break;
                Case2: words = "TWO" + words ; break;
                Case3: words = "THREE" + words ; break;
                Case4: words = "FOUR" + words ; break;
                Case5: words = "FIVE" + words ; break;
                Case6: words = "SIX" + words ; break;
                Case7: words = "SEVEN" + words ; break;
                Case8: words = "EIGHT" + words ; break;
                Case9: words = "NINE" + words ; break;
                Case0: words = "ZERO" + words ; break;
            }
            num/=10;  //123/10=123
        }
        System.out.println(words);
    }
}
