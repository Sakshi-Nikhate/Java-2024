//sum of digit = product of digit 
public class SpyNo {
    public static void main(String[] args) {
    int num =132;
    int sum =0;
    int pro =1;
  
   for(int i=num; i>0; i/=10)
   {
    int rem =i%10;
    sum+=rem;
    pro*=rem;
   }
    System.out.println((sum==pro)?(num+" is SPY number "):(num+" is not SPY number"));
}
}