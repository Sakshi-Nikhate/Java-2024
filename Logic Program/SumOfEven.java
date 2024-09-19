public class SumOfEven {
    public static void main(String[] args) {
        int sum = 0; 
      System.out.print("Even numbers from 1 to 60: "); 
         for (int i = 1; i <= 60; i++) { 
             if (i % 2 == 0) { 
                System.out.print(i + " ");  
                sum += i;  
            } 
        } 
    System.out.println("\nSum of even numbers from 1 to 60: " + sum); 
    } 
} 