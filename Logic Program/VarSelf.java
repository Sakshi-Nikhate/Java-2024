public class VarSelf {
    public static void main(String[] args) {
        int a = 10;
         int b = 20;
           void add()
           {
            int c = 30, d ;
            d = a+b+c;
            System.out.println(d);
           }
           void mul()
           {
            int e = 40 , f ;
            f = a*b*c*d*e ;
            System.out.println(f);
           }
    }
}
