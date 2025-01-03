import java.util.*;
public class RecursionBubble {
    Static int i=0;
    public static void main(String[] args) {
        int [] arr = {5,4,6,3, 7,2,8,1,9};
        System.out.println(Arrays.toString(arr));
        RecursionBubble (arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void RecursionBubble (int [] arr) {

        for(int j= i+1;j< arr.length;j++){
            if (arr[i] > arr[j]) {
                int temp =arr[i];
                arr [i] = arr[j];
                arr[j] = temp;

            }
        }
        i++;
        if(i == arr.length)
           return;
        RecursionBubble(arr);
    }
}