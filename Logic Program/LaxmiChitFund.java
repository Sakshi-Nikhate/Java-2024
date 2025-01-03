import java.util.*;
public class LaxmiChitFund 
{
    static Scanner sc = new Scanner (System.in);
        static String user;
        static Long phone ;
        static String add;
        static String type;
        static int pin;
        static double bal;
        static ArrayList<String> tran = new ArrayList<>();
        public static void main(String[] args) 
        {
            for( ; ; )
            {
                System.out.println();
                System.out.println(" *** WELCOME*** ");
                System.out.println("  LAXMI CHIT FUND  ");
                System.out.println();
                System.out.println("1. New Account" );
                System.out.println("2. login");
                System.out.println();
                System.out.println("Enter an option : ");
                int option = sc.nextInt();
                switch (option) {
                    case 1: newAccount();break;
                    case 2: loginUser();break;
                    default: System.out.println("Wrong option entered");
                }
            }
        }
        public static void newAccount()
        {
            if(user!=null)
            {
                System.out.println();
                System.out.println("Account is Already created Login");
                return;
            }
            System.out.println();
            System.out.println("Account Creation");
            System.out.println("Username : ");
            sc.nextLine();
            user = sc.nextLine();
            System.out.println("Phone Number: ");
            phone = sc.nextLong();
            System.out.println("Address: ");
            sc.nextLine();
            add=sc.nextLine();

            System.out.println("Pin: ");
            pin = sc.nextInt();
            System.out.println("Account Type: ");
            type = sc.next();
            System.out.println("Amount to be deposited: ");
            bal = sc.nextDouble();
            tran.add("Creditedem : " +bal);
            System.out.println();
            System.out.println("Credited: "+ bal);
            System.out.println();
            System.out.println("Account Created");
        }
        public static void loginUser()
        {
            if(user!=null)
            {
                System.out.println();
                System.out.println("Login");
                System.out.println("Username : ");
                sc.nextLine();
                String user1 = sc.nextLine();
                System.out.println("Pin: ");
                int pin1 = sc.nextInt();
                if(user1.equals(user)&&pin==pin1)
                {
                    features();
                }
                else{
                    System.out.println();
                    System.out.println("Wrong cred");
                    System.out.println();
                }
            }
            else{
                System.out.println("create your account frist ");
            }
        }
        public static void features()
        {
            for( ; ; )
            {
                System.out.println();
                System.out.println("Features");
                System.out.println("1.Deposit Amount");
                System.out.println("2.Debit Amount");
                System.out.println("3.Check Balance");
                System.out.println("4.Transfer Amount");
                System.out.println("5.Statement");
                System.out.println("6.Edit Account ");
                System.out.println("7.Loan& More");
                System.out.println("8.Logout");
                System.out.println();
                int option = sc.nextInt();
                switch (option) 
                {
                    case 1:depositAmount();break;
                    case 2:debitAmount();break;
                    case 3:checkBalance();break;
                   // case 4:transferAmount();break;
                    case 5:statement();break;
                    //case 6:editAccount();break;
                    //case 7:loan();break;
                    case 8:System.exit(0);
                    default:System.out.println("Wrong option"); 
                }
                  System.out.println();
            }
        }
                public static void statement()
                {
                    System.out.println();
                    System.out.println("Statement");
                    System.out.println();
                    for(String i : tran){
                        System.out.println(i);
                    }
                    System.out.println();
                }
                public static void checkBalance()
                {
                    System.out.println("Check Balance");
                    System.out.println();
                    System.out.println("Enter your pin : ");
                    int pin1 =sc.nextInt();
                    if(pin==pin1)
                    {
                        System.out.println();
                        System.out.println("Your account balance is : "+bal+" rs");
                    }else{
                        System.out.println();
                        System.out.println("Wrong pin entered");
                    }
                }
                public static void depositAmount()
                {
                    System.out.println();
                    System.out.println("deposit Amount ");
                    System.out.println();
                    System.out.println("Enter an amount : ");
                    double deposit= sc.nextDouble();
                    bal = bal + deposit;
                    tran.add("Credited : "+ deposit);
                    System.out.println();
                    System.out.println("Amount Deposited ");
                }
                public static void debitAmount()
                {
                    System.out.println();
                    System.out.println("debit Amount ");
                    System.out.println();
                    System.out.println("Enter an amount : ");
                    double debit = sc.nextDouble();
                    System.out.println("Enter your pin : ");
                    int pin1=sc.nextInt();

                    if (pin==pin1)
                    {
                        if(pin==pin1)
                        {
                            bal=bal-debit;
                            tran.add("Debited :" + debit);
                            System.out.println("Amount Debited");
                        }else{
                            System.out.println();
                            System.out.println("Insufficient funds");
                        }
                    }else{
                        System.out.println();
                        System.out.println("Wrong pin entered");
                    }
                }
                public static void transferAmount() {
                    System.out.println();
                    System.out.print("Transfer Amount ");
                    System.out.println();
                    System.out.print("Enter Username to transfer amount : ");
                    sc.nextLine();
                    String userTransfer = sc.nextLine();
                    System.out.println();
                    System.out.print("Enter Transfer Amount : ");
                    double amount = sc.nextDouble();
                    System.out.println("Enter Your Pin : ");
                    int pin1 = sc.nextInt();
            
                 if(pin==pin1) {
                    if(amount <=bal) {
                        bal = bal - amount;
                        tran.add("Transfered : " + amount + " to " +userTransfer);
                        System.out.println("Amount Transfered Succesfully"); 
                    }else {
                        System.out.println("Insufficient Fund");
                    }
                 }else {
                    System.out.println("Wrong pin Entered");
                 }
                }
                public static void editAccount() {
                    System.out.println();
                    System.err.println("Edit Account Details");
                    System.out.println("1. Change Username");
                    System.out.println("2. Change Phone Number");
                    System.out.println("3. Change Address");
                    System.out.println("4. Change Pin");
                    System.out.println();
                    int option = sc.nextInt();
            
                    switch(option) 
                    {
                        case 1: System.out.println("Enter a New UserName");
                        sc.nextLine();
                        user = sc.nextLine();
                        System.out.println("UserName updated Successfully");
                        break;
                        
                        case 2: System.out.println("Enter a new Phone Number");
                        phone = sc.nextLong();
                        System.out.println("Phone Number updated successfully");
                        break;
            
                        case 3: System.out.println("Enter new Address ");
                        sc.nextLine();
                        add = sc.nextLine();
                        System.out.println("Address updated successfully");
                        break;
            
                        case 4 : System.out.println("Enter cuurent pin : ");
                        int pin1 = sc.nextInt();
                        if(pin1==pin) {
                            System.out.println("Enter a new pin : ");
                            pin = sc.nextInt();
                            System.out.println("Pin updated successfully");
                        } else {
                            System.out.println("Incorrect current pin ");
                        }
                        break;
                        default : System.out.println("Wrong option Entered");
                    }
                }
                public static void Loan() {
                    System.out.println();
                    System.out.println("Loan Services : ");
                    System.out.println("Apply for loan");
                    System.out.println();
                    applyLoan();
                }
          
                public static void applyLoan()
    {
        System.out.println();
        System.out.println("Select Loan Type : ");
        System.out.println("1. Vehicle Loan");
        System.out.println("2. Home Loan");
        System.out.println("3. Gold Loan");
        System.out.println("4. Education Loan");
        System.out.println();
        int loanType = sc.nextInt();
        double interestRate = 0 ;
        double maxLoanAmount = 0;
        String loanName = "";

        switch(loanType) {
            case 1: loanName = "Vehicle Loan";
            interestRate = 7.5;
            maxLoanAmount = 500000;
            break;

            case 2: loanName = "Home Loan";
            interestRate = 6.5;
            maxLoanAmount = 3000000;
            break;

            case 3: loanName = "Gold Loan";
            interestRate = 7.0;
            maxLoanAmount = 200000;
            break;

            case 4: loanName = "Education Loan";
            interestRate = 4.5;
            maxLoanAmount = 800000;
            break;
            default: System.out.println("Invalid option Entered");
            return;
        }
        System.out.println();
        System.out.println("You have selected " + loanName);
        System.out.println("Interest rate : " +interestRate + " % per annum");
        System.out.println("Max loan amount is " + maxLoanAmount);
        System.out.println();

        System.out.println("Enter loan amount : ");
        double loanAmount = sc.nextDouble();
        
        if(loanAmount > maxLoanAmount) {
            System.out.println("Sorry, maximum loan amount for this loan is " + maxLoanAmount);
        }
        else {
            System.out.println("Your loan applied successfully");
            tran.add("loan Applied" +loanAmount);
        }
    }

}

            
        
    

