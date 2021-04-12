public class perfectNumber {
    public static boolean isPerfectNumber(int number)
    {
        if (number<1)
            return false;
        int i=0,sum=0;
        for(i=1;i<=Math.sqrt(number);i++)
        {
            if(number%i==0)
                sum+=i;
        }
        if(sum==number)
            return true;
        return false;
    }
}
