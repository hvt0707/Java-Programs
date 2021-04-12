import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] array = {3,10,1,4,3,6,7,2};
        System.out.println(kSum(array, 50));
    }

    static boolean zeroSum(int[] a){
//        for(int i=0;i<a.length;i++){
//            int sum=0;
//            for(int j=i; j<a.length;j++){
//                sum += a[j];
//                if(sum == 0){
//                    return true;
//                }
//            }
//      }
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for(int x: a){
            set.add(sum);
            sum+=x;

            if(set.contains(sum)){
                return true;
            }
        }
       return false;
    }

    static boolean kSum(int[] a, int k){
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for(int x: a){
            set.add(sum);
            sum+=x;

            if(set.contains(sum-k))
                return true;
        }
        return false;
    }
}
