import java.util.Scanner;
public class EmirpNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =11;
        int dup =num;
        boolean flag = true ;
        for(int i=2;i<num;i++)
        {
            if (num%i==0) {
                flag = false;
                break;
            }
        }
        if(flag)
        {
            int rev =0;
            while (num>0) {
                int rem = num%10;
                rev = rev*10 +rem;
                num/=10;
            }
            boolean flag2 = true;
            for(int i=2;i<rev; i++)
            {
                if (rev%i==0) {
                    flag2 = false;
                    break;
                }
            }
            if(flag2){
                System.out.println(dup+" is an EmirpNo");
            }else{
                System.out.println(dup+" is not EmirpNo");
            }
        }
        else{
            System.out.println(dup+" is not EmirpNo");
        }
    }
}
