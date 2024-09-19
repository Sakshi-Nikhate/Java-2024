import java.util.Scanner;
class Calculater2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        outerLoop:
        for( ; ; )
        {
            System.out.println();
            System.out.println("***CALCULATER***");
            System.out.println();
            System.out.println("Enter operand 1 : ");
            double operand1 = sc.nextDouble();
            System.out.println("Enter operand 2 : ");
            double operand2 = sc.nextDouble();
            System.out.println("Enter an operator : ");
            char operator = sc.next().charAt(0);
            double output= 0;
            switch(operator)
            {
                case '+' : output = operand1+operand2;break;
                case '-' : output = operand1-operand2;break;
                case '*' : output = operand1*operand2;break;
                case '/' : output = operand1/operand2;break;
                case '%' : output = operand1%operand2;break;
                case '#' : break outerLoop;
                default : System.out.println("Wrong Operator");break;
            }
            System.out.println("output is : " + output);
        }
    }
}
