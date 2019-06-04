package medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class KThLargestElement {

    public static void main(String[] args){

        int[] nums = new int[] {3,2,1,5,6,4};
        int k = 3;
        System.out.println(findKthLargestElement(nums,k));
    }

    public static int findKthLargestElement(int[] nums,int k){
        int output = 0 ;
        PriorityQueue<Integer> queue= new PriorityQueue(Collections.reverseOrder());

        for(int i:nums){
            queue.add(i);
        }
        while(k>0){
            output = queue.poll();
            k--;
        }
        return output;
    }
}
