class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> lst=new ArrayList<>(map.entrySet());
        Collections.sort(lst,(a,b)->{
            if(!a.getValue().equals(b.getValue())){
                return a.getValue()-b.getValue();
            }
            return b.getKey()-a.getKey();
        });
        int ind=0;
        for(Map.Entry<Integer,Integer> entry:lst){
            int value=entry.getValue();
            while(value>0){
                nums[ind++]=entry.getKey();
                value--;
            }
        }
        return nums;
    }
}