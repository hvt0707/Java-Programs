import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of entries:");
        minimum(readIntegers(scanner.nextInt()));
    }

    public static int[] readIntegers(int count){
        int[] myArray = new int[count];
        System.out.println("Enter the numbers:");
        for(int i=0;i<count;i++)
            myArray[i] = scanner.nextInt();
        return myArray;
    }

    public static void minimum(int[] array){
        int min = array[0];
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1])
                min = array[i+1];
        }
        System.out.println(min +" is minimum.");
    }
}
