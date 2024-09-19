import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if((year% 400 ==0)||((year% 4 ==0)&& (year % 100!= 0))){
         System.out.println(year + " : Leap Year ");
        }
        else
            System.out.println(year + ": Non-Leap Year");
        }
    }



















 