public class LongestCommonPrefix {

    public static void main(String[] args){

        String[] input = new String[] {"flower" , "flow" , "flour"};
        System.out.println(longestCommonPrefix(input));
    }
        public static String longestCommonPrefix(String[] strs) {
            if(strs == null || strs.length == 0) return "";
            String prefix = strs[0];
            for(int i = 1; i < strs.length; i++) {
                while(strs[i].indexOf(prefix) != 0 && prefix.length() > 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
            }
            return prefix;
        }
}
