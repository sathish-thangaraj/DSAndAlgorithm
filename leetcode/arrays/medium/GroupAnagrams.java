package medium;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args){
        String[] input = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagram(input);
    }

    public static void groupAnagram(String[] input){
        List<List<String>> anagramGroups = new ArrayList<>();
        boolean[] checked = new boolean[input.length];
        for(int i=0;i<input.length;i++) {
            List<String> anagrams = new ArrayList<>();
            if (!checked[i]) {
                anagrams.add(input[i]);
                checked[i] = true;
                for (int j = i + 1; j < input.length; j++) {
                    if (isAnagram(input[i], input[j])) {
                        anagrams.add(input[j]);
                        checked[j] = true;
                    }
                }
                anagramGroups.add(anagrams);
            }
        }
        System.out.println(anagramGroups);
    }

    public static boolean isAnagram(String s1 , String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] counter = new int[128];

        for(int i=0;i<s1.length();i++){
            int j = s1.charAt(i);
           counter[j]++;
        }

        for( int i=0;i<s2.length();i++){
            int j = s2.charAt(i);
            counter[j]--;
            if(counter[j]<0){
                return false;
            }
        }

        return true;
    }
}
