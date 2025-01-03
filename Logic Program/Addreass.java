public class Addreass {
    String street;
    String landmark;
    int pincode;

    Address(String street , String landmark , int pincode);
    {
        this.street = street;
        this.landmark = landmark;
        this.pincode = pincode;
    }

    void displayAddress()
    {
        System.out.println();
        System.out.println("Address Details");
        System.out.println("street name : " + street);
        System.out.println("landmark  : " + landmark);
        System.out.println("pincode : " + pincode);
    }
}
class User
{
    String username;
    String password;
    Address address;

    //para constru
    User(String username, String password, String street, String landmark,int pincode)
   {
    this.username = username;
    this.password = password;
    this.address = new Address(street, landmark, pincode);
   }

   //copy constru
   User(User existing)
   {
    //obj1 ref
    this.username = existing.username;
    this.password = existing.password;
    this.address = existing.address;
   }
void displayUser()
 {
    System.out.println("User Details");
    System.out.println("Username : "+ username);
    System.out.println("password:"+ password);
 }
}
class ShallowCopyExample
{
    public static void main(String[] args) {
        
        User existing = new User("Ramesh","ramesh123","JM")
    }
}