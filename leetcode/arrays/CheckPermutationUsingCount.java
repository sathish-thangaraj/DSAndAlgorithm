public class CheckPermutationUsingCount {

    public static void main(String[] args){
        System.out.println(checkPermutation("athishs" , "sathish"));
    }

    public static boolean checkPermutation(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int[] count = new int[128];

        for(int i=0 ; i<s1.length() ;i++){
            int val = s1.charAt(i);
            count[val]++;
        }

        for(int i=0; i<s2.length(); i++){
            int val = s1.charAt(i);
            count[val]--;
            if(count[val] <0 ){
                return false;
            }
        }
        return true;
    }
}
