/*
1) Convert the string to char array
2) Iterate through the character array till Given True Length and found the total number of spaces
3) Calculate the final String Length = trueLength + total Number of Spaces * 2 ( we need to multiply each space by 2)
4) Check the string length with final Length . If given String length is less than final Length return Invalid Inputs.
5) Iterate the character array from Reverse direction starting from True Length
6) If the character not equals space , then assign character to finalLength index and reduce the final count by 1
7) If the character equals space , then assign next three characters to %20 and reduce the final Count by 3
 */

public class URLify {

    public static void main(String[] args){
        String s = "Ms Ahalya veera kumara      " ;
        char[] input = s.toCharArray();
        urlify(input,22);
    }

    public static void urlify(char[] input , int trueLength){
        int totalSpaces = countTotalSpaces(input,trueLength);
        int finalLength = trueLength + totalSpaces*2 ;

        if(input.length < finalLength){
            System.out.println("invalid input string , count does not match");
        }

        for(int i=trueLength-1 ; i >=0 ; i--){
            System.out.println("i th " + input[i]);
            if(input[i] == ' '){
                input[finalLength-1] = '0' ;
                input[finalLength-2] = '2' ;
                input[finalLength-3] = '%' ;
                finalLength = finalLength -3 ;
            }
            else{
                input[finalLength-1] = input[i];
                finalLength--;
            }
        }
        System.out.println(new String(input));
    }

    public static int countTotalSpaces(char[] input,int trueLength){
        int space = 0 ;
        for(int i=0;i<trueLength;i++){
            if(input[i] == ' '){
                space++ ;
            }
        }
        return space;
    }
}
