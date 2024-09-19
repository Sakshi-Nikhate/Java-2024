import java.util.Scanner;
class TemperatureConverter
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** TEMPERATURE CONVERTER ***");
        System.out.println();
        System.out.println("1.KELVIN 2.FAHRENHEIT 3.RANKINE 4.REAUMUR");
        System.out.println();
        System.out.println("Enter the temp in C : ");
        float cel = sc.nextFloat();
        System.out.println("Enter an option : ");
        int option = sc.nextInt();
        System.out.println();
        
        switch(option)
        {
            case 1 :{
                float kelvin = cel+273.15f;
                System.out.println("       output:- "+cel+ " C = "+kelvin+"K");
                break;
            }
             case 2 :{
                float fah = cel*(9/5.0f)+32;
                System.out.println("       output:- "+cel+ " C = "+fah+"F");
                break;
            }
             case 3 :{
                float rankine = (cel+273.15f)*(9/5.0f);
                System.out.println("       output:- "+cel+ " C = "+rankine+"R");
                break;
            }
             case 4 :{ 
                float rea = (cel*4)/5.0f;
                System.out.println("       output:- "+cel+ " C = "+rea+"Re");
                break;
            }
            default:{
                System.out.println("WRONG OPTION ENTERED");
            }
        }
    }
}
