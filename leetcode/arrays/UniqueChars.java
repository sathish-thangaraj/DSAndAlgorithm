/*

This class finds the unique chars in the string using boolean array

String.charAt(position) method returns the character , When you assign the character to the integer value ,

you will get the ASCII value of the character.
 */

public class UniqueChars {
    public static void main(String[] args){
        String s = "Aksith" ;
        System.out.println("given string in " + isUniqueChars(s) );
    }

    public static boolean isUniqueChars(String input){
        boolean[] char_set = new boolean[128] ;
        for(int i=0 ; i<input.length() ; i++){
            int val = input.charAt(i);
            if(char_set[val]){
                return false;
            }
            else {
                char_set[val] = true ;
            }
        }
        return true ;
    }
}
