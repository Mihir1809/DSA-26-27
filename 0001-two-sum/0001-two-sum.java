class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ci=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int r=target-nums[i];
            if(ci.containsKey(r)){
                return new int[] {ci.get(r),i};
                }
                ci.put(nums[i],i);
        }
        return new int[] {};
    }
}