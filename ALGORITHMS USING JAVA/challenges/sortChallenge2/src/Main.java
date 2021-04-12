public class Main {
    public static void main(String[] args) {
        int[] intArray = {12,-3,45,32,-9,23,2};

//        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
//            int i;
//            int newElement = intArray[firstUnsortedIndex];
//            for(i = firstUnsortedIndex; i>0 && intArray[i-1] > newElement; i--){
//                intArray[i] = intArray[i-1];
//            }
//            intArray[i] = newElement;
//        }

        insertionSort(intArray,intArray.length);

        for(int i = 0; i < intArray.length; i++)
            System.out.print(intArray[i]+"  ");
    }

    public static void insertionSort(int[] input, int numItems){
        if(numItems < 2)
            return;

        insertionSort(input, numItems-1);
        int newElement = input[numItems-1];
        int i;
        for(i = numItems-1; i > 0 && input[i-1] > newElement; i--){
            input[i] = input[i-1];
        }

        input[i] = newElement;
    }
}
