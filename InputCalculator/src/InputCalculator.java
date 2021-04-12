import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);
        float count=0;
        int sum=0;
        while(true)
        {
            boolean isInt = scanner.hasNextInt();
            if(isInt)
            {
                int number = scanner.nextInt();
                sum+=number;
                count++;
            }
            else
                break;
        }
        int avg = Math.round(sum/count);
        System.out.println("SUM = "+sum+" AVG = "+avg);
        scanner.close();
    }
}
