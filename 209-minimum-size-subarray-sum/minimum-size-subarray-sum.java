class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ei=0;
        int si=0;
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int sum=0;
        while(ei<n){
            sum+=nums[ei];
            while(sum>=target){
                min=Math.min(min,ei-si+1);
                sum=sum-nums[si];
                si++;

            }
            ei++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}