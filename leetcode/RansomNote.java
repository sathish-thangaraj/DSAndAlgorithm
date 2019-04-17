import java.util.HashMap;

// https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
// O(n+m) complexity

public class RansomNote {

    public static void main(String[] args) {

       // String[] magazine = new String[]{"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};

        // String[] note = new String[]{"ive", "got", "some", "coconuts"};

        String[] magazine = new String[] {"give", "me","one","grand","today","night"};
        String[] note = new String[] {"give","one","grand","today"};

        checkMagazine(magazine,note);
    }

    static void checkMagazine(String[] magazine, String[] note) {

        HashMap<String,Integer> magazineMap = new HashMap<String,Integer>();
        HashMap<String,Integer> noteMap = new HashMap<String,Integer>();

        for(int i=0 ; i<magazine.length ; i++){
            if(magazineMap.containsKey(magazine[i])){
                magazineMap.put(magazine[i],magazineMap.get(magazine[i])+1);
            }
            else{
                magazineMap.put(magazine[i],1);
            }
        }

        for(int i=0 ; i<note.length ; i++){
            if(magazineMap.containsKey(note[i])){
                magazineMap.put(note[i],magazineMap.get(note[i])-1);
                if(magazineMap.get(note[i]) <0 ){
                    System.out.println("No");
                    return;
                }
            }
            else{
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

}
