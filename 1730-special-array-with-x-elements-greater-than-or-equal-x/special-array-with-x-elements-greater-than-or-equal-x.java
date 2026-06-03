class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        for(int x=0;x<=n;x++){
            int cnt=0;
            for(int num:nums){
                if(num>=x){
                    cnt++;
                }
            }
            if(cnt==x){
                return x;
            }
        }
        return -1;
    }
}