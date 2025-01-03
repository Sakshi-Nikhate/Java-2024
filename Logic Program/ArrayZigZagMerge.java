import java.util.*;
public class ArrayZigZagMerge {
    public static void main(String[] args) {
        int [] a = {10,20,30,40,50};
        int [] b = {60,70,80};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int [] c = new int[a.length + b.length];
        System.out.println(Arrays.toString(c));

        for(int i=0,cindex=0;i<a.length;i++)
        {
            c[cindex++]=a[i];
            if(i<b.length)
               c[cindex++]= b[i];
        }
        System.out.println(Arrays.toString(c));
    }
}
 