public class EvenDigitSum {
    public static int getEvenDigitSum(int number)
    {
        if(number<0)
            return -1;
        int rem=0,sum=0;
        while(number!=0)
        {
            rem = number%10;
            if(number%2==0)
                sum+=rem;
            number/=10;
        }
        return sum;
    }
}
