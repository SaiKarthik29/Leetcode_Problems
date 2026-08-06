class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        ArrayList<Integer> lst=new ArrayList<>();
        int resSum=0;
        for(int i=nums.length-1;i>=0;i--){
            lst.add(nums[i]);
            resSum+=nums[i];
            sum=sum-nums[i];
            if(resSum>sum){
                break;
            }
            
        }
        return lst;
    }
}