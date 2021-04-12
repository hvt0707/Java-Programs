public class SumOddRange {
    public static boolean isOdd(int number)
    {
        if(number<0 || number%2==0)
            return false;
        return true;
    }
    public static int sumOdd(int start, int end)
    {
        if(start>0 && end>0 && end>start)
        {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i))
                    sum = sum + i;
            }
            return sum;
        }
        else
            return -1;
    }
}
