import java.util.Scanner;
import java.util.ArrayList;
public class JMART 
{
    static Scanner sc = new Scanner (System.in);
          static String username ; //null
          static String contact ; //null
          static String address ; //null
          static ArrayList<String> cart = new ArrayList<>();
          static double totalBill; //0.0
    public static void main(String[] args) 
    {
       for( ; ; )
       {
        System.out.println();
        System.out.println
        ("   ** ***WELCOME TO JMART*** **   ");
        System.out.println();
        System.out.println("1.Existiing User");
        System.out.println("2.Create Account");
        System.out.println();
        System.out.println("Enter Option : ");
        int option = sc.nextInt();
        System.out.println();
        switch (option) {
            case 1:{
                loginPage();
                break;
            }
            case 2:{
                createAccountPage();
                break;
            }   
            default: {
                System.out.println("Wrong option Entered");
                break;
            }   
        }
       }   
    }
    public static void loginPage()
    {
        if(username!=null)
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println();
                System.out.println("   ***  LOGIN MODULE  ***   ");
                System.out.println();
                System.out.println("Username/Contact : ");
                sc.nextLine();
                String username2= sc.nextLine();
                System.out.println("Password : ");
                String password2 = sc.next();
                if (username.equals(username2))
                (contact.equals(username2));
                (password.equals(password2));
                {
                    System.out.println();
                    System.out.println("LOGIN SUCCESSFULLY");
                    homePage();
                }else{
                    System.out.println();
                    System.out.println("Wrong CREDE Entered");
                }
            }
        }else{
            System.out.println();
            System.out.println("CREATE YOUR ACCOUNT FRIST");
            return;
        }
        System.out.println();
        System.out.println("THANKU NEVER VISIT AGAIN");
        System.out.println(0);
    }
    public static void createAccountPage()
    {
        System.out.println();
        System.out.println("  *** CREATE ACCOUNT MODULE ***  ");
        System.out.println();
        System.out.print("Enter your Username : ");
        sc.nextLine();
        username = sc.nextLine();
        System.out.print("Enter your Contact : ");
        contact = sc.next();
        System.out.print("Enter your Password : ");
        password = sc.next();
        System.out.print("Address : ");
        sc.nextLine();
        System.out.println();
        System.out.println("Account Created Successfully");
        System.out.println();
    }
    public static void homePage()
    {
       for( ; ; )
      {
        System.out.println();
        System.out.println(" *** HOME PAGE *** ");
        System.out.println();
        System.out.println("1.Electronics");
        System.out.println("2.Clothing");
        System.out.println("3.Footware");
        System.out.println("4.Cart");
        System.out.println("5.Logout");
        System.out.println();
        System.out.println("Enter an option : ");
        int option= sc.nextInt();
        switch (option) {
            case 1:{
                electronicsPage();
                break;
            }
            case 2:{
                clothingPage();
                break;
            }
            case 3:{
                footwarePage();
                break;
            }  
            case 4:{
                cartPage();
                break;
            } 
            case 5:{
                 System.exit(0);
            }   
            default :{
                System.out.println("Wrong options Entered");
                break;
            }
        }

    }
}
public static void electronicsPage()
{
    for( ; ; )
    {
        System.out.println();
        System.out.println(" **** ELECTRONICS PAGE ****");
        System.out.println();
        System.out.println("1.Mobile(101)");
        System.out.println("2.Laptop(102)");
        System.out.println("3.Smart Watch(103)");
        System.out.println("4.Camera(104)");
        System.out.println("5.Home Page(0)");
        System.out.println();
        System.out.print("Enter a product id : ");
        System.out.println();
        int productId = sc.nextInt();
        switch(productId)
        {
            case 101:{
                cart.add("Mobile : 40000 /-");
                totalBill +=40000 ;
                 System.out.println("Mobile added inside cart");
                 break;
            }
            case 102:{
                cart.add("Laptop: 70000 /-");
                totalBill +=70000 ;
                 System.out.println("Laptop added inside cart");
                 break;
            }
            case 103:{
                cart.add("SmartWatch : 20000 /-");
                totalBill +=20000 ;
                 System.out.println("SmartWatch added inside cart");
                 break;
            }
            case 104:{
                cart.add("Camera : 140000 /-");
                totalBill +=140000 ;
                 System.out.println("Camera added inside cart");
                 break;
            }
            case 0: {
                return;
            }
            default:{
                System.out.println("Please enter a correct product id");
                break;
            }
        }
    }
}
public static void clothingPage()
{
    for( ; ; )
    {
        System.out.println();
        System.out.println("  ***Clothing Page***  ");
        System.out.println();
        System.out.println("1.Shirt(105)");
        System.out.println("2.Tshirt(106)");
        System.out.println("3.Jeans(107)");
        System.out.println("4.Home Page(0)");
        System.out.println();
        System.out.println("Enter a product id : ");
        System.out.println();
        int productId = sc.nextInt();
        switch (productId) 
        {
            case 105:{
                cart.add("Shirt : 1000 /-");
                totalBill +=1000 ;
                 System.out.println("Shirt added inside cart");
                 break;
            }
            case 106:{
                cart.add("Tshirt : 1200 /-");
                totalBill +=1200 ;
                 System.out.println("Tshirt added inside cart");
                 break;
            }
            case 107:{
                cart.add("Jeans : 2000 /-");
                totalBill +=2000 ;
                 System.out.println("Jeans added inside cart");
                 break;
            }
            case 0: {
                return;
            }
            default: {
                System.out.println("Please enter a correct product id");
                break;
            }
        }
    }
}
public static void footwarePage()
{
    for( ; ; )
    {
        System.out.println();
        System.out.println("  ***Footware Page***  ");
        System.out.println();
        System.out.println("1.Shoes(108)");
        System.out.println("2.Crocs(109)");
        System.out.println("3.Slippers(110)");
        System.out.println("4.Heels(111)");
        System.out.println("5.Home Page(0)");
        System.out.println();
        System.out.println("Enter a product id : ");
        System.out.println();
        int productId = sc.nextInt();
        switch(productId)
        {
            case 108:{
                cart.add("Shoes : 4000 /-");
                totalBill +=4000 ;
                 System.out.println("Shoes added inside cart");
                 break;
            }
            case 109:{
                cart.add("Crocs : 4000 /-");
                totalBill +=4000 ;
                 System.out.println("Crocs added inside cart");
                 break;
            }
            case 110:{
                cart.add("Slippers : 1000 /-");
                totalBill +=1000 ;
                 System.out.println("Slippers added inside cart");
                 break;
            }
            case 111:{
                cart.add("Heels : 1200 /-");
                totalBill +=1200 ;
                 System.out.println("Heels added inside cart");
                 break;
            }
            case 0: {
                return;
            }
            default: {
                System.out.println("Please enter a correct product id");
                break;
            }   
        }
    }
}
public static void cartPage()
{
    ArrayList<String> cart1 =new ArrayList<>(cart);
    for( ; ; )
    {
        System.out.println();
        System.out.println("  ***CART***  ");
        System.out.println("  *** YOU PURCHASED ***  ");
        for(String product : cart1)
        {
            System.out.println(product);
        }
        System.out.println();
        System.out.println(username + "your bill is : "+ totalBill);
        System.out.println();
        System.out.println("Do you want to remove some product (YES/NO) : ");
        String op1 = sc.next();
        if(op1.equals("YES"))
        {
            System.out.println("Enter the product name : ");
            String productName = sc.next();
            int indx =0;
            for(String product : cart1)
            {
                String [] arr = product.split(" ");
                if
                    (arr[0].equalsIgnoreCase(productName)){
                    cart.remove(indx);
                    totalBill-=Double.parseDouble(arr[2]);
                    System.out.println();
                    System.out.println("Removed" + productName + "from the cart");
                    System.out.println();
                }
                indx++;
            }
        }
        System.out.println();
        System.out.println("Do you want to checkout (YES/NO) : ");
        System.exit(0);
    }else{
        return;
    }
  }
 }
