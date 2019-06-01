package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
1) Iterate over the list
2) Sort the strings
3) Assign the strings in to hashmap , Key as sorted string and value and original string
4) If the map already has that key , add the extra element to the list.
5) If the map already is not having the key , put it in to the map
 */
public class GroupAnagramsHashMap {

    public static void main(String[] args){
        String[] input = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagram(input);
    }

    public static void groupAnagram(String[] input) {
        HashMap<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {

            char[] chars = input[i].toCharArray();
            Arrays.sort(chars);
            String newWord = new String(chars);
            if(!map.containsKey(new String(chars))){
                List<String> words = new ArrayList<>();
                words.add(input[i]);
                map.put(newWord , words);
            }
            else{
                map.get(newWord).add(input[i]);
            }

        }

        for (String s : map.keySet()) {
            List<String> values = map.get(s);

                System.out.print(values);

        }
    }
}
