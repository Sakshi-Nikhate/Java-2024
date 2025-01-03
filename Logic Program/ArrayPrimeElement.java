import java.util.Scanner;
public class ArrayPrimeElement {
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

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

        // Find and display prime numbers
        System.out.println("Prime numbers in the array:");
        boolean foundPrime = false;
        for (int num : array) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                foundPrime = true;
            }
        }

        if (!foundPrime) {
            System.out.println("No prime numbers found.");
        }

        scanner.close();
    }
}


