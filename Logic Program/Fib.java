public class Fib {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1+" "+num2+" ");
        for(int i=1;i<=10;i++)
        {
            int op = num1+num2;
            System.out.println(op+" ");
            num1 = num2;
            num2 = op;
        }
    }
}
