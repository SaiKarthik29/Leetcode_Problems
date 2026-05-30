class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]==nums[1] && nums[1]==nums[2]){
            return "equilateral";
        }
        if(nums[0]+nums[1]>nums[2]){
            if(nums[1]+nums[2]>nums[0]){
                if(nums[2]+nums[0]>nums[1]){
                    HashSet<Integer> set=new HashSet<>();
                    for(int i=0;i<nums.length;i++){
                        set.add(nums[i]);
                    }
                    if(set.size()==3){
                        return "scalene";
                    }
                    else{
                        return "isosceles";
                    }
                }
                else{
                    return "none";
                }
            }
            else{
                return "none";
            }
        }
        else{
            return "none";
        }
    }
}