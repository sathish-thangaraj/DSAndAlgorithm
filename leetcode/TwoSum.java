mport java.util.*;

/*
 *
 * Authored by Sathish Thangaraj
 *
 * Iterate over the array elements
 * Store the complments in the HashMap
 * If HashMap Key matches the target , target is found i.e a+b = target , a = target - b
 * Return the position of the elements
 *
 * */
class Solution {
	    public int[] twoSum(int[] nums, int target) {
		            
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
