public class SelectionSortArray {
    public static void main(String[] args) {
        String[] arr = {"Sakshi", "Rishabh", "Mansi", "Devanshu", "Prerna"};
 
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;  
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[maxIndex]) > 0) {
                    maxIndex = j;  
                }
            }
            String temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        System.out.println("Names in descending order:");
        for (String name : arr) {
            System.out.println(name);
        }
    }
}