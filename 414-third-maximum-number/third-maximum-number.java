class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        int res=0;
        if(n==1){
            return nums[0];
        }else if(n==2){
            return (nums[0]>nums[1])?nums[0]:nums[1];
        }
        else{
            long max1=Long.MIN_VALUE;
            long max2=Long.MIN_VALUE;
            long max3=Long.MIN_VALUE;
            for(int num:nums){
                if(num==max1 || num==max2 || num==max3){
                    continue;
                }
                else if(num>max1){
                    max3=max2;
                    max2=max1;
                    max1=num;
                }
                else if(num>max2){
                    max3=max2;
                    max2=num;
                }
                else if(num>max3){
                    max3=num;
                }
            }
            if(max3==Long.MIN_VALUE){
                res=(int)max1;
            }
            else{
                res=(int)max3;
            }
        }
        return res;
    }
}