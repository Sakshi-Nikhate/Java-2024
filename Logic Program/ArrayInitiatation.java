import java.util.*;
public class ArrayInitiatation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[][] arr= new int [size1][];

        for(int i=0;i<size1;i++){
            System.err.println("Enter the 2nd Dim size for"+(i+1)+ "array:");
            int size2 = sc.nextInt();
            arr[i] = new int [size2];
        }
        System.err.println(Arrays.deepToString(arr));
        for(int i=0;i<size1;i++){
            for(int j=0;j<arr[i].length;j++)
            System.err.println("Enter the "+(j+1)+"elemants of " +(i+1)+ "array:");
            int ele = sc.nextInt();
            arr[i][j] = ele ;
        }
    }
}
