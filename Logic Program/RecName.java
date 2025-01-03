import java.util.Scanner;
public class RecName {
static String name;
static int index = 0;
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Name : ");
    name = sc.nextLine();
    printName(name , index :0 );
    }
    public static void printName(String name, int index){
        if(index == name.length()){
            return;
        }
        System.out.println(name.charAt(index));
        printName(name, index +1);
    }    
}
