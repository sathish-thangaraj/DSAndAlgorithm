import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args){

        System.out.println(romanToInt("IV"));
    }

        public static int romanToInt(String s) {

            int total = 0 ;

            HashMap<Character,Integer> romanToInt = new HashMap<Character,Integer>();
            romanToInt.put('I' , 1);
            romanToInt.put('V', 5);
            romanToInt.put('X', 10);
            romanToInt.put('L' , 50);
            romanToInt.put('C', 100);
            romanToInt.put('D', 500);
            romanToInt.put('M', 1000);

            for(int i=0 ; i<s.length(); i++){

                if ((i == s.length()-1) || (romanToInt.get(s.charAt(i)) >= romanToInt.get(s.charAt(i+1)))){
                    total = total + romanToInt.get(s.charAt(i)) ;
                }

                else
                    total = total - romanToInt.get(s.charAt(i));

            }
            return total;
        }
}
