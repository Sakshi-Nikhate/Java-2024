public class SumOfPrime {
    public static void main(String[] args) {
        int total;
        int sum = 0;  
    for(int num = 1; num <= 30; num++)  
    {  
      total = 0;  
      for (int i = 2; i <= num/2; i++)  
    {  
      if(num % i == 0)  
    {  
      total++;  
         break;  
    }    
}
     if(total == 0 && num != 1 )  
    {  
    sum = sum + num;  
    }    
    }    
       System.out.println("The Sum of Prime Numbers from 1 to 30 is: " + sum);  
    }
}  
