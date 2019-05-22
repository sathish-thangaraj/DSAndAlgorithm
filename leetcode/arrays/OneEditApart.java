/*

There are two scenarios here .
1) One could be replacement of a letter . In case of replacement number of characters remain same. We can iterate through both the
strings same time and return false if thers is more than one mismatch
2) Other option could be insert / delete of an character . In this case one string will be having extra character.
3) We can have two variables i,j and iterate through both the strings . If there is mismatch then increment longer string and keep going .
if the difference between j and i more than 1 then return false.

 */

public class OneEditApart {

    public static void main(String[] args){
        String s1 = "sappa" ;
        String s2 = "appa" ;

        int s1Length = s1.length();
        int s2Length = s2.length();

        if(s1Length == s2Length){
            System.out.println(checkForReplacement(s1,s2));
        }

        if(Math.abs(s1Length-s2Length)>1){
            System.out.println("Length difference is more than 1");
        }

        if(s1Length<s2Length){
            System.out.println(checkForInsert(s1,s2));
        }
        else{
            System.out.println(checkForInsert(s2,s1));
        }

    }

    public static boolean checkForReplacement(String s1 , String s2){
        boolean isOneEditApart = false ;
        for(int i=0; i<s2.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(isOneEditApart){
                    return false ;
                }
                isOneEditApart = true ;
            }
        }
        isOneEditApart = true ;
        return isOneEditApart;
    }

    public static boolean checkForInsert(String s1, String s2){
        int i=0 , j=0 ;

        while(i<s1.length()){

            if(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
            if(j-i > 1){
                return false;
            }
        }
        return true;
    }
}
