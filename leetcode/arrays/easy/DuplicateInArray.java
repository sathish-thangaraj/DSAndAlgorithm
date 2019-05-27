//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
class DuplicateInArray {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> char_set = new HashSet<Integer>();
        
        for(int i:nums){
            if(!char_set.add(i)){
                return true;
            }
        }
        return false;
    }
}
