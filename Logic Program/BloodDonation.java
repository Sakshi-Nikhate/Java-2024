import java.util.Scanner; 
 
  class BloodDonation{ 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
         
        System.out.print("Enter your age: "); 
        int age = sc.nextInt();
        System.out.print("Enter your weight: "); 
         int weight = sc.nextInt();
         System.out.print("Enter your cosumption of Alcohol% in last 24 hours: "); 
         int Alcohol = sc.nextInt();
       
        if (age >= 20) { 
            System.out.println("You are ready to donate the Blood"); 
        } 
        else if(weight>=50)
        { 
            System.out.println("You are ready to donate the Blood");
       } 
       else if (Alcohol==0)
       {
           System.out.println("You are ready to donate the Blood");
       }
       else { 
            System.out.println("You are not ready to donate the Blood."); 
        } 
    } 
} 
