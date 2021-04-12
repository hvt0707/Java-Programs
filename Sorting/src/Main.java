import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of entries: ");
        int[] myArray = getIntegers(scanner.nextInt());
        myArray = sortArrays(myArray);
        printIntegers(myArray);
    }

    public static int[] getIntegers(int number){
        int[] array = new int[number];
        System.out.println("Enter the numbers to be sorted: ");
        for(int i=0;i<number;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static int[] sortArrays(int[] array){
        for(int round=1;round<array.length;round++){
            for(int i=0;i<array.length-round;i++){
                if(array[i]<array[i+1]){
                    array[i]=array[i]+array[i+1];
                    array[i+1]=array[i]-array[i+1];
                    array[i] = array[i]-array[i+1];
                }
            }
        }
        return array;
    }

    public static void printIntegers(int[] array){
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+"  ");
    }
}
