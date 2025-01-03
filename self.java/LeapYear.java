public class LeapYear {
    public static void main(String[] args) {
        int year=2002;
        if(year%4==0){
            if(year %100==0){
                if(year%400==0){
            System.out.println("leap yr");
         }
         else{
            System.out.println("not a leap yr");
         }
    }
    else{
        System.out.println("leap yr");
    }
}
else{
    System.out.println("leap yr");
}
}
}