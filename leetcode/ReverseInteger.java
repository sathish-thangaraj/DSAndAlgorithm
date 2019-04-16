/*
Authored by Sathish Thangaraj

1) Take the input and modulo by 10 , it will give you one digit
2) Divide input by 10 , it will reduce your input by one digit
3) Add the modulo output and multiply the existing output by 10
4) do this while input !=0

 */

public class ReverseInteger {

    public static void main(String[] args) {
        int input = -321;
        System.out.println(reverseInteger(input));
    }

    public static long reverseInteger(int input) {
        long output = 0 ;
        while(input!=0){
            int mod = input%10;
            output = mod + output*10;
            input = input / 10 ;
        }
        return output;
    }
}
