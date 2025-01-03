import java.util.*;
public class ArrayUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        
        int [] arr = new int [size];
        for (int i= 0; i < size; i++)
         {
           System.out.println("Enter the "+(i+1)+ "element : ");
           arr[i] =sc.nextInt();    
        }
        System.out.println(Arrays.toString(arr));
    }
}
