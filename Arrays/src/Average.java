import java.util.Scanner;

public class Average {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of entries: ");
        System.out.println("Average = "+getAverage(scanner.nextInt()));
    }
    public static double getAverage(int number){
        int[] array = new int[number];
        int sum=0;
        System.out.println("Enter "+number+" values:");
        for(int i=0;i<number;i++){
            array[i] = scanner.nextInt();
            sum+=array[i];
        }
        return((double)sum/number);
    }
}
