public class SelectionSort {

    public static void main(String[] args){
        int[] nums = new int[] {20,2,40,1,8,30,4};
        selectionSort(nums);
    }

    public static void selectionSort(int[] nums){
        // Move i from 0 to length of Array
        for(int i=0;i<nums.length;i++){
            int minIndex = i;
            // Move j from i to length of array
            for(int j=i;j<nums.length;j++){
                // Keep track of the min array
                if(nums[j]<nums[minIndex]) {
                    minIndex = j;
                }
            }
            // Replace i index with min value;
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

        }

        for(int i:nums)
            System.out.println(i);
    }
}
