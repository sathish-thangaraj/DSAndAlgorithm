class MoveZeroesToEnd {
    public void moveZeroes(int[] nums) {
        int counter = 0 ;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                counter++;
            }
            else{
                nums[i-counter] = nums[i];
            }
        }
        int length = nums.length;
        while(counter > 0){
            nums[length-counter] = 0 ;
            counter--;
        }
    }
}
