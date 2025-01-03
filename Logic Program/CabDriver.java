import java.util.*;
public class CabDriver
 {
    static int driverId = 123;
    private int id;
    private String name;
    private Long contact;
    private String type;
    private String car;
    private Long account;
    private String status = "Available";

    CabDriver(String name , Long contact , String type , String car , Long acount )
    {
        super();
        this.name=name;
        this.contact=contact;
        this.type=type;
        this.car=car;
        this.account=acount;
        this.id=driverId++;
    }
    public String getName(){
        return this.name;
    }
    public void setString (String newName){
        this.name=newName;
    }
    public Long gertContact(){
        return this.contact;
    }
    public void setContact(Longcontact){
        this.contact=newContact;
    }
    public String getType(){
        return this.type;
    }
    public String getCar(){
        return this.car;
    }
    public Long getAccount(){
        return this.account;
    }
    public void setAccount (Long newAccount){
        this.account =newAccount;
    }
    public String getStatus(){
        return this.status;   
    }
    public void setstatus (String newStatus){
        this.status = newStatus;
    }
    public int getId(){
        return this.id;
    }
    public void cabDriver(){
        System.out.println();
        System.out.println("***CAB DETAILS***");
        System.out.println("Booking id :"+this.id);
        System.out.println("Driver name :"+this.getName());
        System.out.println("Type of car :"+this.getType());
        System.out.println("Status :"+this.getStatus());
    }
    public void displayCabDriverAfterBooking(){
        System.out.println();
        System.out.println("***CAB DETAILS***");
        System.out.println("Booking id :"+this.id);
        System.out.println("Driver name :"+this.getName());
        System.out.println("Contact:"+this.getContact());
        System.out.println("Type of car :"+this.getType());
        System.out.println("Car Number:"+this.Car());
        System.out.println("Account Number:"+this.getAccount());
        System.out.println("Status :"+this.getStatus());
    }
}
class Passenger{
    String name;
    String start;
    String end;
    long contact;
    int noPass;

    Passenger(String name , String start, String end, Long contact , int noPass)
    {
        super();
        this.name= name;
        this.start= start;
        this.end= end;
        this.contact= contact;
        this.noPass= noPass;
    }
    public String getName(){
            return this.name;
        }
        public void setName(String newName){
            this.name=newName;
        }
        public String getStart(){
            return this.end;
        }
        public void setEnd (String newEnd){
            this.end=newEnd;
        }
        public long getContact(){
            return this.contact;
        }
        public void setContact(Long newContact){
            this.contact= newContact;
        }
        public int getNoPass(){
            return this.noPass;
        }
    }
    class SavariDriver
    {
        static ArrayList <CabDriver> ListCab = new ArrayList<>();
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            CabDriver obj1 = new CabDriver("Ramesh",987654321l,"sedan","MH12AA1234",789456123654l);
            CabDriver obj2 = new CabDriver("Suresh",985674321l,"Hatchback","MH12AA5678",789456123654l);
            CabDriver obj3 = new CabDriver("Mahesh",787654321l,"suv","MH12AA3456",789456123654l);
            CabDriver obj4 = new CabDriver("Ganesh",1230456789l,"xuv","MH12AA8967",123654789025l);
            
            ListCab.add(obj1);
            ListCab.add(obj2);
            ListCab.add(obj3);
            ListCab.add(obj4);

            String start = null;
            String  end = null;
            String name = null;
            String contact = 0;
            String noPass = 0;

            for( ; ; )
            {
                System.out.println();
                System.out.println("WELCOME TO SAVARI");
                System.out.println();
                System.out.println("Book a Ride:");
                System.out.println("ENTER a name:");
                sc.nextLine();
                name = sc.nextLine();
                System.out.println("Start Dest:");
                start = sc.nextLine();
                System.out.println("End Dest:");
                start = sc.nextLine();
                System.out.println("Contact:");
                contact  = sc.nextLong();
                System.out.println("No. of Pass:");
                noPass = sc.nextInt();


                Passenger pass = new Passenger (name , start, end, contact,noPass);
                System.out.println();
                for(CabDriver i : ListCab)
                {
                    if(i.getStatus().equals("Available"))
                    {
                        i.displayCabDriver();
                    }
                }
                System.out.println();
                System.out.println("Enter the Booking id:");
                int bookid = sc.nextInt();

                for(bookid == i.getId())
                {
                    i.setstatus("Occupied");
                    i.displayCabDriverAfterBooking();
                    System.out.println();
                    System.out.println("Your ride has been Booked");
                }                
            }
        }
    }
