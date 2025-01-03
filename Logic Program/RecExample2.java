public class RecExample2 {
    public static void main(String[] args) 
        {
            printNumbers(1);
        }
        public static void printNumbers(int num)
        {
            System.out.println(num++);
            if(num==11)
            return;
            printNumbers(num);
        }
    }

