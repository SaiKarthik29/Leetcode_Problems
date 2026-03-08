class Solution {
    public int smallestBalancedIndex(int[] nums) {
        long leftSum=0;
        long rightSum=1;
        long leftS[]=new long[nums.length];
        long rightS[]=new long[nums.length];
        leftS[0]=0;
        for(int i=1;i<nums.length;i++){
            leftSum=leftSum+nums[i-1];
            leftS[i]=leftSum;
        }
        rightS[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
           
            if(rightSum > 100000000000000L){
                rightS[i] = Long.MAX_VALUE;
            }
            else{
                rightSum = rightSum * nums[i+1];
                rightS[i] = rightSum;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(leftS[i]==rightS[i]){
                return i;
            }
        }
        return -1;
    }
}