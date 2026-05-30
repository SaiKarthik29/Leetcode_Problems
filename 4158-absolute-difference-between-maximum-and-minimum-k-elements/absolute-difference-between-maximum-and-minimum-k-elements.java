class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int s=0;
        int l=0;
        for(int i=0;i<k;i++){
            s=s+nums[i];
            l=l+nums[n-i-1];
        }
        return Math.abs(s-l);
    }
}