public class BubbleSort {

    public static void main(String[] args){
        int[] nums = new int[] {1,10,3,9,15,2};
        bubbleSort(nums);
    }

    public static void bubbleSort(int[] nums){

        // Move i from o to array length -1
        for(int i=0;i<nums.length-1;i++) {
            // Compare the neighboring elements
            // If  they are not in order swap them
            // Limit the comparision to length-1-i to avoid swapping again
            for (int j = 0; j < nums.length - 1-i; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
            for(int i:nums)
                System.out.println(i);

    }
}
