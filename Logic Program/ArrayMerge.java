import java.util.*;
public class ArrayMerge {
    public static void main(String[] args) {
        
    int [] a ={10,20,30,40};
    int [] b ={50,60,70,80,90,100};
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));

    int [] c = new int [a.length+b.length];
    System.out.println(Arrays.toString(c));

    for (int i=0,bindex=0;i<c.length;i++)
    {
        if(i<a.length)
        c[i] = a[i];

        else
        c[i] = b[bindex++];
    }
    System.out.println(Arrays.toString(c));
}
}
