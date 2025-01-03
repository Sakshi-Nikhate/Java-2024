import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        // Sample array
        int[] array = {96 ,89, 05, 67, 93};

        // Display the original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Perform Selection Sort
        selectionSort(array);

        // Display the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Loop through the array
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the smallest element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
