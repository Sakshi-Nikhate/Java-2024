public class Automorphic {
    public static void main(String[] args) {
        int num = 76;
        int dup = num;
        int sqr = num*num;
        int count = 0;

        while (num>0) {
            count ++;
            num/=10;
        }
        int div = 1;
        for(int i=1; i<=count; i++)
        div *=10;

        if((sqr%div)==dup)
            System.out.println(dup+" is AutomorphicNo ");
        else
            System.out.println(dup+ " is not AutomorphicNo "); 
               
    }
}
