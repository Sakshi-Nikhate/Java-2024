import java.util.Scanner;
class Password
{
    public static void Main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String StorePassword = "Sakshi@2002";
        int duration = 5000;
        
        //Lable for OuterLoop
        OuterLoop:
        for( ; ; ) //infinite loop it will break only
                  //when user is entering correct pin 
        {
            int attempt = 3;  //initially user has 3 attempts in every second 
            do{
                System.out.println();
                 System.out.println("Enter your Password : ");
                 String UserPassword = sc.next();
                 //validateif store and user entered password correctly 
                 
                 if (StorePassword.equals(userPassword....))
                 {
                      System.out.println("PHONE HAS BEEN UNLOCKED");
                      break OuterLoop;
                      
                      //Breaking outerLoop is pass is correct 
                 }
                 else{
                      System.out.println("Wrong Password entered "+ (attempt-1)+ " Attempt left");
                 }
                 attempt--; //updating the attempt
                 }
                 while(attempt/=0); //check the condition
                  System.out.println();
                   System.out.println("Phone is locked for" + (duration/1000)+"Second");
                   
                   
                  //Pause the execution for duration ms
                   
                   Thread.Sleep(duration);
                   duration*= 2;   
        }
    }
}