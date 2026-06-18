public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res=0,t=32;
        while(t>0){
            res<<=1;
            res|=(n&1);
            
            n>>=1;
            t--;
        }
        return res;
    }
}