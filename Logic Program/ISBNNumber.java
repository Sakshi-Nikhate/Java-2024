public class ISBNNumber {
    public static void main(String[] args) {
        int num = 1259060977;
        int dup = num;
        int num1 = 1;
        int sum = 0;
        while (num>0) {
            int rem = num%10;
            sum+=(rem* num1++);
            num/=10;
        }
        System.out.println(sum%11==0?dup+" is ISBN Number" :dup+" is not ISBN Number");
    }
}
