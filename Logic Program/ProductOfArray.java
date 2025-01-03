import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array and input elements
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the product of elements
        long product = 1;
        for (int num : array) {
            product *= num;
        }

        // Display the result
        System.out.println("The product of the array elements is: " + product);

        scanner.close();
    }
}


