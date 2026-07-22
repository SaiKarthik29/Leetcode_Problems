class Solution {
    public boolean divideArray(int[] nums) {
        int res[]=new int[501];
        for(int i=0;i<nums.length;i++){
            res[nums[i]]++;
        }
        int pairs=0;
        for(int i=1;i<501;i++){
            if(res[i]%2==0 && res[i]>=2){
                pairs+=res[i]/2;
            }
        }
        int divided=nums.length/2;
        if(pairs>=divided){
            return true;
        }
        return false;
    }
}