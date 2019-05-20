import java.util.HashMap;
import java.util.Map;

/*
1) If the permutation is palindrome each character should be there even number of times except one character

2) Count each character in the string and keep the character and their count in hashmap
3) Exclude special characters
4) Iterate through the hashmap and check the count .
5) if count is equal to 1 , return true
 */

public class PalindromePermutation {

    public static void main(String[] args){
        String input = "aabbccddf" ;
        HashMap<Integer,Integer> countMap = countTheCharacters(input);
        System.out.println(countMap.size());
        int count = 0 ;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if(entry.getValue()%2 != 0){
                count++ ;
            }
        }
        if(count == 1){
            System.out.println("Given string is Palindrome Permutation");
        }
    }

    public static HashMap countTheCharacters(String input){

        HashMap<Integer,Integer> countMap = new HashMap();
        for(int i=0; i<input.length(); i++) {
            int value = getValue(input.charAt(i));
            if(value != -1){
                if (countMap.containsKey(value)) {
                    countMap.put(value, countMap.get(value) + 1);
                }
                else{
                    countMap.put(value,1);
                }
            }

        }
        return countMap;

    }

    public static int getValue(char inputChar){
        int value = 0 ;
        value = Character.getNumericValue(inputChar) ;
        int startValue = Character.getNumericValue(' ');
        int endValue = Character.getNumericValue('z');
        System.out.println("startValue" + startValue + "endValue" + endValue + value);
        return value;
    }
}
