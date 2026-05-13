class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int copy[]=Arrays.copyOf(nums,n);
        Arrays.sort(copy);
        for(int i=0;i<copy.length-1;i++){
            if(copy[i]*2>copy[n-1]){
                return -1;
            }
        }
        int res=copy[n-1];
        for(int i=0;i<n;i++){
            if(nums[i]==res){
                return i;
            }
        }
        return -1;
    }
}