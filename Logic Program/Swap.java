public class Swap {
    public static void main(String[] args) {
        int s = 100, r = 200;

        System.out.println("Before Swap");
        System.out.println("s = " + s);
        System.out.println(" r = " + r);

        int rs = s;
        s = r;
        r = rs;

        System.out.println("After swap");
        System.out.println("s = " + s);
        System.out.println("r = " + r);
    }
}
