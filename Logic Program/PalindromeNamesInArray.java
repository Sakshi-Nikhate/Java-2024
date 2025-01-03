import java.util.Scanner;

public class PalindromeNamesInArray {

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of names
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array and input names
        String[] names = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        // Find and display palindrome names
        System.out.println("Palindrome names in the array:");
        boolean foundPalindrome = false;
        for (String name : names) {
            if (isPalindrome(name)) {
                System.out.println(name);
                foundPalindrome = true;
            }
        }

        if (!foundPalindrome) {
            System.out.println("No palindrome names found.");
        }

        scanner.close();
    }
}


