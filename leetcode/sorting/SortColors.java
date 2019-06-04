//https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/798
package medium;

public class SortColors {

    public static void main(String[] args){
        int[] input = new int[]{2,0,2,1,1,0};
        sortColors(input);
    }

    public static void sortColors(int[] nums) {


        int j = nums.length - 1;
        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > j) break;
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;

            }

            if (nums[i] == 2) {

                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i--;
                j--;
            }

        }
    }
}
