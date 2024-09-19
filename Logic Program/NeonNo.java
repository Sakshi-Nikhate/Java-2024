public class NeonNo {
    public static void main(String[] args) {
        int num = 9;
        int sqr = num*num;
        int sum = 0;

        while (sqr>0)
        {
          sum+=sqr%10;
          sqr/=10 ;                          
        }
        System.out.println(sum==num?num+" is Neon No": num+" is not Neon No");
    }
}
