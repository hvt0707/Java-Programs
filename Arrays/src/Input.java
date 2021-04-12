import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArrays = inputArrays(5);
        for(int i=0;i<myArrays.length;i++)
            System.out.println(myArrays[i]);
        scanner.close();
    }

    public static int[] inputArrays(int i){
        System.out.println("Print "+i+" Values:\n");
        int[] values = new int[i];
        for(int j=0;j<i;j++){
            values[j]=scanner.nextInt();
        }
        return values;
    }
}
