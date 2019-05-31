class Anagram {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[128];
        
        if(s.length() != t.length()){
            return false;
        }
        
        for(int i=0 ; i<s.length() ;i++){
            int val = s.charAt(i);
            count[val]++;
        }
        
        for(int i=0 ; i<t.length() ;i++){
            int val = t.charAt(i);
            count[val]--;
            if(count[val] <0 ){
                return false;
            }
        }
        return true;
        
    }
}
