import java.util.Scanner;
class Palandrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter A Number : ");
        int num = sc.nextInt();
        int OrgNum = num;
        int rev =0;
        while(num>0)
        { 
            int rem = num%10;
            rev = (rev*10)+rem;
            num/=10;
    }
     System.out.println("(rev==OrgNum)? " Num is Palandrome " : " Not Palandrome ");
}
}