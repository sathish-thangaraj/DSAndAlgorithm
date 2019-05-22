/*
We can use string builder to build the string
we can iterate through the string and check ith character with i+! character
If i == i+1 then keep incrementing the counter
If i != i+1 then append the character to string builder and reset the counter 
 */

public class StringCompression {

    public static void main(String[] args){
        String s1 = "abcdeffffffffffff" ;
        System.out.println(getCompressedString(s1));
    }

    public static String getCompressedString(String input){
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 1 ;
        for(int i=0; i<input.length()-1; i++){
            System.out.println(input.charAt(i));
            if(input.charAt(i) == input.charAt(i+1)){
                counter++;
                if(i== input.length()-2){
                    stringBuilder.append(input.charAt(i));
                    stringBuilder.append(counter);
                }
            }
            else{
                stringBuilder.append(input.charAt(i));
                stringBuilder.append(counter);
                counter = 1 ;
            }
        }
        return stringBuilder.toString().length()<input.length()?stringBuilder.toString():input;
    }
}
