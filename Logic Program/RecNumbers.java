public class RecNumbers {
        static int a = 50;
        public static void main(String[] args) 
          {
           printNumbers();
          }
            public static void printNumbers()
            {
                System.out.print(a-- + " ");
                if (a==19)
                return;
                printNumbers();
    }
}
