class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left=0;
        long sum=0;
        long max=0;
        HashSet<Integer> set=new HashSet<>();
        for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum=sum-nums[left];
                left++;
            }
            sum+=nums[right];
            set.add(nums[right]);
            if(right-left+1==k){
                max=Math.max(max,sum);
                set.remove(nums[left]);
                sum=sum-nums[left];
                left++;
            }
        }
        return max;
    }
}