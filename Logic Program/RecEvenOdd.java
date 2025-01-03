public class RecEvenOdd {
    static int num = 20;
    public static void main(String[] args)
     {
        printEvenOdd(num);
    }
    public static void printEvenOdd(int num)
    {
        if(num>70){
            return;
        }
        if(num%2==0)
        System.out.println((num+ "is Even"));

        printEvenOdd(num+1);
    }
}
