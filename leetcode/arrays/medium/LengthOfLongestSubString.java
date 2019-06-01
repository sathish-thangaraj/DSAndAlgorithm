package medium;


import java.util.HashMap;

public class LengthOfLongestSubString {

    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("dvabcabcdf"));
    }
        public static int lengthOfLongestSubstring(String s) {
        if(s.length()<1){
            return 0;
        }
            HashMap<Character,Integer> map = new HashMap<>();
            int longest = Integer.MIN_VALUE;
            int counter = 0 ;
            for(int i=0;i<s.length();i++){
                if(map.containsKey(s.charAt(i))){
                    longest = Math.max(longest,counter);
                    counter = 0 ;
                    i = map.get(s.charAt(i));
                    map = new HashMap<>();

                }
                else{
                   map.put(s.charAt(i),i);
                    counter++;
                }
            }
            return  Math.max(longest,counter);
        }
    }
