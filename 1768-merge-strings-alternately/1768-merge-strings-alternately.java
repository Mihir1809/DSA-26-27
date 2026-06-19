class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        char c,d;
        for(int i=0;i<Math.max(word1.length(),word2.length());i++){
            if(i<word1.length()){
            c=word1.charAt(i);
            s=s+c;}
            if(i<word2.length()){
            d=word2.charAt(i);
            s=s+d;}
        }
        return s;
    }
}