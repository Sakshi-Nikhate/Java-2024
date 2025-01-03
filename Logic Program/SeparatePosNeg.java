 import java.util.ArrayList;
import java.util.List;

public class SeparatePosNeg {
    public static void main(String[] args) {
        // Input array
        int[] array = {12, -7, 5, -3, 9, -1, -8, 4, 10, -6};

        // Separate the positive and negative elements
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        for (int element : array) {
            if (element >= 0) {
                positives.add(element);
            } else {
                negatives.add(element);
            }
        }

        // Display results
        System.out.println("Positive elements: " + positives);
        System.out.println("Negative elements: " + negatives);
    }
}
  