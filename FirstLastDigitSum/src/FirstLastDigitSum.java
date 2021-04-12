public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number)
    {
        int first=0,last=0;
        if(number<0)
            return -1;
        last = number%10;
        while(number!=0)
        {
            if(number<10)
                 first = number;
            number/=10;
        }
        return first+last;
    }
}
