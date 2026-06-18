class Solution {
    public int missingNumber(int[] nums) {
       int t=nums.length;
       t=(t*(t+1))>>1;
       for(int i=0;i<nums.length;i++)
       {
       t-=nums[i];
       }
       return t; 
    }
}
