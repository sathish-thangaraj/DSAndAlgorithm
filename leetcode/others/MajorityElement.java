class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> countMap = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            
            if(countMap.containsKey(nums[i])){
                countMap.put(nums[i],countMap.get(nums[i])+1);
                if(countMap.get(nums[i]) > nums.length/2){
                    return nums[i];
                }
            }
            else{
                countMap.put(nums[i],1);
            }
        }
        return nums[0];
    }
}
