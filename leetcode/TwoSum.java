import java.util.*;

/*

Authored by Sathish Thangaraj

Iterate over the array elements
Store the complments in the HashMap
If HashMap Key matches the target , target is found i.e a+b = target , a = target - b
Return the position of the elements

*/
class TwoSum {

    public static void main(String[] args){

        int[] input = new int[] {2,1,7,9,11};
        int target = 3 ;
       int[] result = twoSum(input,target);

       for(int i : result){
           System.out.println(i);
       }
    }


    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> complement = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(complement.containsKey(nums[i])){
                return new int[] {complement.get(nums[i]),i};
            }
            else{
                complement.put(target-nums[i],i);
            }

        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
