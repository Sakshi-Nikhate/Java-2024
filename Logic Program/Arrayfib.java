public class Arrayfib {
    public static void main(String[] args) {
            int[] fibonacci = new int[10];
    
            fibonacci[0] = 0; // First Fibonacci number
            fibonacci[1] = 1; // Second Fibonacci number

            for (int i = 2; i < fibonacci.length; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
    
            System.out.println("First 10 Fibonacci numbers:");
            for (int num : fibonacci) {
                System.out.print(num + " ");
            }
        }
    }
    

