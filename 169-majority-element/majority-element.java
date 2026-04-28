class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0,can=0;
        for(int i:nums){
            if(cnt==0){
                can=i;
            }
            if(i==can){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return can;
    }
}