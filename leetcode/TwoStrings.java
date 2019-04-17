import java.util.HashMap;

public class TwoStrings {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(twoStrings(s1, s2));
    }

    static String twoStrings(String s1, String s2) {
        HashMap<Character, Integer> s1Map = new HashMap<Character, Integer>();
        for(char c : s1.toCharArray()) {
            s1Map.put(c, 1);
        }
        for(char c : s2.toCharArray()) {
            if(s1Map.containsKey(c)) {
                return "YES";
            }
        }
        return "NO";
    }
}
