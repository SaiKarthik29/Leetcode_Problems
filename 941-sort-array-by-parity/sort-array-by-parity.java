class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        int res[]=new int[nums.length];
        int ind=0;
        for(int i=0;i<even.size();i++){
            res[ind++]=even.get(i);
        }
        for(int i=0;i<odd.size();i++){
            res[ind++]=odd.get(i);
        }
        return res;
    }
}