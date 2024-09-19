public class PerfectNo {
    public static void main(String[] args) {
        int num = 28;
        int sum = 0;
        for(int i=1; i<num; i++)
        {
            if(num%i==0)
            sum+=i;
        }
        if(num==sum)
        System.out.println(num+" is Perfect No");
        else
          System.out.println(num+" is not Perfect No");
    }
}
