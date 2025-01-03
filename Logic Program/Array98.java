import java.util.*;
public class Array98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chapter :");
        int chpt = sc.nextInt();
        System.out.println("start :");
        int start = sc.nextInt();
        System.out.println("end : ");
        int end = sc.nextInt();
        int op = solve(chpt, start, end);
        System.out.println(op);
    }
    private static int solve(int chpt, int start, int end){

        return(end-start>chpt)? chpt : (end-start )+1;
    }
}
