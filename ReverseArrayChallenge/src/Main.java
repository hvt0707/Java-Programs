import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of entries:");
        int[] myArray = readIntegers(scanner.nextInt());
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(reverse(myArray)));
        System.out.println(Arrays.toString(reverse(myArray)));
    }

    public static int[] readIntegers(int count){
        int[] myArray = new int[count];
        System.out.println("Enter the numbers:");
        for(int i=0;i<count;i++)
            myArray[i] = scanner.nextInt();
        return myArray;
    }

    public static int[] reverse(int[] array){
        int temp;
        for(int i=0;i<array.length/2;i++){
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        return array;
    }
}
