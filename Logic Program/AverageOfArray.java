 import java.util.Scanner;
 public class AverageOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
 
        double[] array = new double[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / n;

        System.out.println("The average of the array elements is: " + average);
        scanner.close();
    }
}


