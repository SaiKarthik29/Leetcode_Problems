class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        float avg=0;
        HashSet<Float> set=new HashSet<>();
        while(i<j){
            avg=(float)(nums[i]+nums[j])/2;
            set.add(avg);
            i++;
            j--;
        }
        return set.size();
    }
}