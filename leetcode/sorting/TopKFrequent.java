package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequent {

    public static void main(String[] args){

        int[] nums = new int[] {1,1,1,2,2,3,3,3,4,4,4,4,4};

        int k = 2 ;

        List<Integer> output = findTopKFrequent(nums,k);

        for(int i : output){
            System.out.println(i);
        }
    }

    public static List<Integer> findTopKFrequent(int[] nums , int k){

        HashMap<Integer,Integer> countMap = new HashMap<>();

        for(int i:nums){
            countMap.put(i,countMap.getOrDefault(i,0)+1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> countMap.get(b)-countMap.get(a));

        maxHeap.addAll(countMap.keySet());

        List<Integer> result = new ArrayList<>();

        for(int i=1;i<=k;i++){
            result.add(maxHeap.poll());
        }

        return result;
    }
}
