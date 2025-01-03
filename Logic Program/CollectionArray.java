import java.util.*;
public class CollectionArray {
    @SuppressWarnings'
    public static void main(String[] args) {
        Collection coll = new ArrayList<>();
            coll.add(10);
            coll.add(20);
            coll.add(30);
            coll.add(40);
            coll.add(50);
            System.out.println(coll);
        
    Object [] arr = coll.toArray();
    System.out.println(Arrays.toString(arr));
    }
}