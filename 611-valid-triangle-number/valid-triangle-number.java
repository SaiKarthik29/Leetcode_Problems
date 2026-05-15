class Solution {
    public int triangleNumber(int[] nums) {
        int cnt=0;
        if(nums.length<=2){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]>nums[k]){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}