import java.util.Scanner;
class CurrencyConverter
{
    public static void main (String[]args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("***CURRENCY CONVERTER***");
        System.out.println("KNOW YOUR CURRENCY RATE");
        System.out.println();
        System.out.println("Currency - 1.USD 2.EUR 3.KWD 4.GBP");
        System.out.println("Enter the amount in INR : ");
        float inr = sc.nextFloat();
        System.out.println("Enter the Currency : ");
        String curr = sc.next().toUpperCase( );
        
        switch(curr)
        {
            case "USD":{
                float usd = inr/83.8152f;
                 System.out.println("INR :"+ inr+"INR=USD : "+usd+"USD");
                 break;
            }
            case "Eur":{
                float eur = inr/83.8152f;
                 System.out.println("INR :"+ inr+"INR=EUR : "+eur+"eur");
                 break;
            }
            case "KWD":{
                float kwd = inr/83.8152f;
                 System.out.println("INR :"+ inr+"INR=KWD : "+kwd+"KWD");
                 break;
            }
            case "GBP":{
                float gbp = inr/83.8152f;
                 System.out.println("INR :"+ inr+"INR=GBP : "+gbp+"GBP");
                 break;
            }
            default:{
                System.out.println("WRONG CURRENCY ENTERED");
                break;
            }
            
        }
    }
}
