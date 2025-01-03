public class RecExample {
    static int a = 100;
    public static void main(String[] args) 
      {
       printNumbers();
      }
        public static void printNumbers()
        {
            System.out.print(a-- + " ");
            if (a==49)
            return;
            printNumbers();
        
    }
}
