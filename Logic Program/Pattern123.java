public class Pattern123 {
    public static void main (String []args)
    {
        for(int i=1; i<=5;i++)
        {
            int num = 4;
            int a = i+num--;
            for(int j=1;j<=i;j++)
            {
                if(j==1)
                System.out.print(i+" ");
                else{
                    
                    System.out.print(a+" ");
                    a = a+num--;
                }
            }
            System.out.println( );
        }
    }
}
