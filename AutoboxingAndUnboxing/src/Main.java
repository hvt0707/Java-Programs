import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myIntArray = new ArrayList<Integer>();
        for(int i=1;i<=10;i++){
            myIntArray.add(Integer.valueOf(i));     //autoboxing
        }
        for(int i=1;i<=myIntArray.size();i++){
            System.out.println(i+".  -->"+myIntArray.get(i-1).intValue()*2);     //unboxing
        }

        ArrayList<Double> myDoubleArray = new ArrayList<Double>();
        for(double i=1;i<=10;i++){
            myDoubleArray.add(i);
        }
        for(double i =1;i<=myDoubleArray.size();i++){
            System.out.println(i+". -->"+myDoubleArray.get((int)(i-1)));
        }
    }
}
