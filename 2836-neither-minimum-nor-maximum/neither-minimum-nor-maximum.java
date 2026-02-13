class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<=2){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=min && nums[i]!=max){
                res=nums[i];
                break;
            }
        }
        return res;
    }
}