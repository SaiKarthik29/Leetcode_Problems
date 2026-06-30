class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            else{
                nums[j]=nums[i];
                j++;
            }
        }
        HashSet<Integer> set=new HashSet<>();
        int i=0;
        while(i<nums.length){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                break;
            }
            i++;
        }
        return i;
    }
}