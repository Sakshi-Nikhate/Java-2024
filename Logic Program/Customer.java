public class Customer {
    int Cid;
    String Cname;
    String Corder;
        
   Customer(int Cid , String Cname , String Corder)
    {
        super();
        this.Cid = Cid;
        this.Cname  = Cname;
        this.Corder = Corder;
    }
    void displayCustomer(){
        System.out.println("Customer Details");
        System.out.println("Name:" +Cname);
        System.out.println("ID:" +Cid);
        System.out.println("Order:" +Corder);
    }
}