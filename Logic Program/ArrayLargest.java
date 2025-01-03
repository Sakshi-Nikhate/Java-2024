public class ArrayLargest {
    public static void main(String[] args) {
        int [] arr = new int [10];
        for(int i=1,index=0;i<=10;i++){
            int num = (int)(Math.random()*1000);
            if(num>100)
               arr[index++]= num;
            else
               i--; 
       }
       System.out.println(Arrays.toString(arr));
       int Largest= Integer.MIN_VALUE;
       for(int ele : arr)
          if(Largest<ele)
            Largest=ele;
    }
       System.out.println(Largest);
    }

p