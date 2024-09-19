import java.util.Scanner;
class VotingSystem
{
    static int bjp,con,ss,mns,aap,nota;
    
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the population : ");
        int pop = sc.nextInt();
        
        for(int i =1; i<=pop;i++)
        {
            System.out.println();
            System.out.println("***WELCOME***");
            System.out.println("1.BJP 2.CONGRESS 3.SHIVSENA 4.MNS 5.AAP 6.NOTA");
            System.out.println();
            System.out.println("Enter an option : ");
            int option = sc.nextInt();
            switch(option)
            {
                case 1:System.out.println("Sabka sath ka sabka vikas.");bjp++;break;
                case 2:System.out.println("Bharat jodo.");con++;break;
                case 3:System.out.println("Hum hai asli shiv sena .");ss++;break;
                case 4:System.out.println("Jai Maharashtra.");mns++;break;
                case 5:System.out.println("Aapka ek vote hume jail se baharv nikal sakta hai.");aap++;break;
                case 6:System.out.println("You are really educated.");nota++;break;
                default: System.out.println("Really you entered this option.");i--;break;
            }
        }
        //bjp,con,ss,mns,aap,nota
        if(bjp>con && bjp>ss && bjp>mns && bjp>aap && bjp>nota)
          System.out.println("BJP has won this election by" +bjp+ "votes");
        else if (bjp<con && con>ss && con>mns && con>aap && con>nota)
          System.out.println("CONGREES has won this election by" +con+ "votes");
           if(ss>con && bjp<ss && ss>mns && ss>aap && ss>nota)
          System.out.println("SHIV SENA  has won this election by" +ss+ "votes");
           if(mns>con && mns>ss && bjp<mns && mns>aap && mns>nota)
          System.out.println("MNS has won this election by" +mns+ "votes");
           if(aap>con && aap>ss && aap>mns && bjp<aap && aap>nota)
          System.out.println("AAP has won this election by" +aap+ "votes");
          else
            System.out.println("you have"+nota+"Vote for NOTA.");
    }
}



