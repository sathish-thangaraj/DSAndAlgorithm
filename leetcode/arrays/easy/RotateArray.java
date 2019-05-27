class RotateArray {
// Rotate the whole array first
// Then rotate the first part from 0 to K
// Then rotate the second part from K to Array Length
    public void rotate(int[] nums, int k) {
        if(nums.length == 1)
            return ;
        k = k%nums.length;
        rotateArray(nums,0,nums.length-1);
        rotateArray(nums,0,k-1);
        rotateArray(nums,k,nums.length-1);
        
    }
    public void rotateArray(int[] input,int start, int end){
        int temp = 0 ;
        while(end>start){
            temp = input[start];
            input[start] = input[end];
            input[end] = temp ; 
            start++;
            end--;
        }
    }
}
