class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        if(n==1){
            return true;
        }
        int frstNum=nums[0];
        boolean greater=false;
        boolean lesser=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=frstNum){
                if(frstNum>nums[i]){
                    greater=true;
                    break;
                }
                else{
                    lesser=true;
                    break;
                }
            }
        }
        if(greater){
            for(int i=1;i<n;i++){
                if(! (nums[i-1]>=nums[i])){
                    return false;
                }
            }
        }
        else{
            for(int i=1;i<n;i++){
                if(! (nums[i-1]<=nums[i])){
                    return false;
                }
            }
        }
        return true;
    }
}