public class PalindromePermutationUsingArray {

    /*
    This method works only for alphabets
     */
    public static void main(String[] args){
        System.out.println(" given value is palindrome permutation " + canPermutePalindrome("carerac"));
    }
        public static boolean canPermutePalindrome(String s) {
            int[] map = new int[128];
            for (int i = 0; i < s.length(); i++) {
                map[s.charAt(i)]++;
            }
            int count = 0;
            for (int key = 0; key < map.length && count <= 1; key++) {
                count += map[key] % 2;
            }
            return count <= 1;
        }
}
