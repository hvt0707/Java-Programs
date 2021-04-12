public class print {
    public static void main(String[] args) {
        int[] array = new int[8];
        for(int i=0;i<array.length;i++){
            array[i]=i*10;
        }
        PrintArray(array);
    }
    public static void PrintArray(int[] printArray){
        for(int i=0;i<printArray.length;i++){
            System.out.println(printArray[i]);
        }
    }
}
