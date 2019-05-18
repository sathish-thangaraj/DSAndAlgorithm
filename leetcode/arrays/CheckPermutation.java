import java.util.Arrays;

public class CheckPermutation {

    public static void main(String[] args){
    System.out.println("Check Permutation " + checkPermutation("dog" , "god"));
    }

    public static boolean checkPermutation(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        return sortArray(s1).equals(sortArray(s2));
    }

    public static String sortArray(String inputString){
        char[] char_set = inputString.toCharArray();
        Arrays.sort(char_set);
        return  new String(char_set);
    }


}
