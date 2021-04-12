public class LargestPrime {
    public static int getLargestPrime(int number)
    {
        if(number<=1)
        return -1;
        int i=0,j=0,flag=0,largest=0;
        for(i=2;i<=number;i++)
        {
            if(number%i==0)
            {
                for(j=2;j<i;j++)
                {
                    if (i % j == 0)
                    {
                        flag = 1;
                        break;
                    }
                }
                if(flag==0 && j>largest)
                    largest=j;
            }
        }
        return largest;
    }
}


