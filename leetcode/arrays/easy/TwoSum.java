import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args){

        int[] nums = new int[] {2,7,11,15};
        int target = 9 ;
        int[] output =  twoSum(nums,target);

        for(int i:output)
            System.out.println(i);
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> compliment = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            if (compliment.containsKey(nums[i])) {
                int firstIndex = compliment.get(nums[i]);
                return new int[]{firstIndex, i};
            } else {
                compliment.put(target - nums[i], i);
            }
        }

        return new int[2];

    }
}
