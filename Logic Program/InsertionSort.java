import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {5,6,4,7,3,8,2,9,1};
        System.out.println(Arrays.toString(arr));
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void InsertionSort(int [] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int key= arr[1];
            int j = i-1;
            while (j>=0 && arr[j]>key)
            {
                i--;
            }
             
        }
    }
}
