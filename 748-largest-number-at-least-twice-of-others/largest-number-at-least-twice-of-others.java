class Solution {
    public int dominantIndex(int[] nums) {
        int lar=nums[0];
        int n=nums.length;
        int ind=0;
        for(int i=1;i<n;i++){
            if(nums[i]>lar){
                lar=nums[i];
                ind=i;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=lar){
                if(nums[i]*2>lar){
                    return -1;
                }
            }
        }
        return ind;
    }
}