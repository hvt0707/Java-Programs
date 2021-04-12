public class FactorPrinter {
    public static void printFactors(int number)
    {
        int i;
        if(number<1)
            System.out.println("Invalid Value");
        else
        {
            for(i=1;i<=number;i++)
            {
                if(number%i==0)
                    System.out.println(i);
            }
        }
    }
}
