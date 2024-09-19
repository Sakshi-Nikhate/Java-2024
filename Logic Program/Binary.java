import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String binary ="";

        for(int i=num; i>0; i/=2)
        {
            binary=(i%2)+binary;
        }
        System.out.println(binary);
    }
}
