import java.util.*;
public class ArrayEvenOdd {
    public static void main(String[] args) {
       int []arr ={1,2,3,4,5,6,7,8,9,10};
       int evenSum = sumOfEvenElements(arr) ;
       int oddSum = sumOfOddElements(arr) ;
       System.out.println("Even sum is:" +evenSum);
       System.out.println("Odd sum is:" +oddSum);
    }
    public static int sumOfEvenElements(int[] arr)
    {
        int evenSum = 0;
        for(int ele : arr)
        if(ele%2 ==0)
           evenSum+=ele;
           return evenSum;
    }
    public static int sumOfOddElements(int[] arr)
    {
        int oddSum = 0;
        for(int ele : arr)
        if(ele%2 ==0)
           oddSum+=ele;
           return oddSum;
    }
}

