class WhileLoopExample 
{
    public static void main (String[]args)
    {
        //original num
        int num  =123;
        //dup num
        int dup =num;
        //initi rev is zero
        int rev = 0;
        //loop will iterate untill num is not zero
        while(num>0)
        {
            int rem =num%10 ; //extracting last digit 
            rev = (rev*10)+rem; //starting it in rev var
            num /= 10; //updating loop by removing last digit 
        }
        System.out.println(dup+" "+ rev);
    }
}
