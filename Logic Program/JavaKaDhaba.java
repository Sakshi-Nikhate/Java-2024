import java.util.Scanner;
class JavaKaDhaba
{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        
        String foodItem="";
        double totalBill=0 ; 
        System.out.println("            ***WELCOME***");
        System.out.println("            JAVA KA DHABA");
        System.out.println();
        
        //INFINITE LOOP FOR MAIN MENU 
        for( ; ; )
        {
            System.out.println
            ("MENU 1.VEG 2.NON-VEG 3.CHECKOUT 4.LOGOUT");
            System.out.println("Enter your option : ");
            int option = sc.nextInt();
            System.out.println();
            //this else if block is for veg menu
            if(option==1)
            {
                System.out.println("***VEG MENU***");
                //INFINITE LOOP for veg menu loop will break if user enters 5
                for( ; ; ) {
                    System.out.println
                    ("1.PANNER TIKKA 2.KAJU CURRY 3.VEG-BIRIYANI 4.VEG-KOFTA 5.MAIN MENU");
                    System.out.println();
                    System.out.println("Enter your option : ");
                    int option1 =sc.nextInt();
                    if(option1==1)
                    {
                        foodItem += "PANNER TIKKA : 250";
                        totalBill+= 250;
                        System.out.println("your order has been added to cart.");
                    }
                   else if(option1==2)
                    {
                        foodItem += "KAJU CURRY : 280";
                        totalBill+= 280;
                        System.out.println("your order has been added to cart.");
                    }
                     else if(option1==3)
                    {
                        foodItem += "VEG-BIRIYANI : 180";
                        totalBill+= 180;
                        System.out.println("your order has been added to cart.");
                    }
                     else if(option1==4)
                    {
                        foodItem += "VEG-KOFTA : 210";
                        totalBill+= 210;
                        System.out.println("your order has been added to cart.");
                    }
                    else if (option1==5)
                {
                    break;
                }
                    }
                    
                }    
                //this else if block is for an non veg block
                else if(option==2)
                {
                System.out.println("***NON-VEG MENU***");
                //INFINITE loop for veg menu loop will break if user enter 5
                for( ; ; ){
                    
                    System.out.println
                    ("MENU 1. BUTTER CHICKEN 2.CHICKEN MASALA 3.CHICKEN BIRIYANI 4.FISH 5.MAIN MENU ");
                    System.out.println();
                    System.out.println("Enter your option : ");
                    int option1 = sc.nextInt();
                    if(option==1)
                    {
                        foodItem += "BUTTER CHICKEN: 300";
                        totalBill+= 300;
                        System.out.println("your order has been added to cart.");
                    }
                    else if(option1==2)
                    {
                        foodItem += "CHICKEN MASALA : 270";
                        totalBill+= 270;
                        System.out.println("your order has been added to cart.");
                    }
                    else if(option1==3)
                    {
                        foodItem += "CHICKEN BIRIYANI : 200";
                        totalBill+= 200;
                        System.out.println("your order has been added to cart.");
                    }
                    else if(option1==4)
                    {
                        foodItem += " FISH : 400";
                        totalBill+= 400;
                        System.out.println("your order has been added to cart.");
                    }
                    else if(option1==5)
                    {
                        break;
                    }
                }
        }
        else if(option==3)
        {
            System.out.println("****YOUR TOTAL BILL****");
            System.out.println();
            System.out.println("Your purchase Item Below:");
            System.out.println(foodItem);
            System.out.println("Total Bill : "+ totalBill + "rs.");
            if(totalBill>=2000)
            {
                System.out.println("You got the Discount of 20%");
                System.out.println("Your bill is : " +(totalBill-((totalBill/100)*20)));
            }
            else if(totalBill>=1000)
           {
             System.out.println("You got the Discount of 10%");
                System.out.println("Your bill is : " +(totalBill-((totalBill/100)*10)));
           }
           else if(totalBill>=500)
           {
                System.out.println("You got the Discount of 5%");
                System.out.println("Your bill is : " +(totalBill-((totalBill/100)*5)));
           }
        }
        else if(option==4)
        {
            System.out.println("**THANK YOU VISIT AGAIN**");
            break;
        }
        System.out.println();
    }
  }
}