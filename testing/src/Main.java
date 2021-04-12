import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int a = 1;
//        System.out.println(a);
//        changeValue(a);
//        System.out.println(a);
        int[] myIntArray = new int[5];
        System.out.println(Arrays.toString(myIntArray));
        changeValue(myIntArray);
        System.out.println(Arrays.toString(myIntArray));
    }
    public static void changeValue(int[] array){
        array[0]=1;
    }
}
