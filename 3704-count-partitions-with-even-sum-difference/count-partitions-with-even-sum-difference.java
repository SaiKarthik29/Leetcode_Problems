class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int cnt=0;
        int prefixSum=0;
        for(int i=0;i<n-1;i++){
            prefixSum+=nums[i];
            sum=sum-nums[i];
            if(Math.abs(prefixSum-sum)%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}