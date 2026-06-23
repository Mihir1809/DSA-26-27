class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim() ;
        int n=s.length();
        int l=s.lastIndexOf(' ') ;
        return (n-l-1) ;
        
    }
}