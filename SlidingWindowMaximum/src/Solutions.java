import java.util.Deque;
import java.util.LinkedList;

public class Solutions {
    public static void main(String[] args) {
        int[] array = {2,3,1,5,7,1,2,5,4,3};
        int[] finalAns = maxSlidingWindows(array,3);

        for(int x: finalAns){
            System.out.print(x+" ");
        }
    }
    public static int[] maxSlidingWindows(int[] nums, int k){
        int n = nums.length;
        Deque<Integer> dq = new LinkedList<>();
        int[] ans = new int[n-k+1];
        int i=0;
        for(; i<k ; i++){
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for(; i < n; i++){
            ans[i-k] = nums[dq.peekFirst()];
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        ans[i-k] = nums[dq.peekFirst()];

        return ans;
    }
}
