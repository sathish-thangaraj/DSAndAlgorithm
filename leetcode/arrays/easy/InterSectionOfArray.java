//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674
class InterSectionOfArray {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> output = new ArrayList<Integer>();
        for(int i:nums1){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        int j = 0 ;
        for(int i:nums2){
            if(map.containsKey(i) && map.get(i)>0){
                output.add(i);
                j++;
                map.put(i,map.get(i)-1);
            }
        }
       int[] output1 = new int[output.size()];
        for(int i=0;i<output.size();i++){
            output1[i] = output.get(i);
        }
        return output1;
    }
}
