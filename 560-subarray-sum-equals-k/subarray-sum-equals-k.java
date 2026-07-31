class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int prefixSum=0;
        int cnt=0;
        for(int num:nums){
            prefixSum+=num;
            int requiredPreffix=prefixSum-k;
            if(map.containsKey(requiredPreffix)){
                cnt+=map.get(requiredPreffix);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return cnt;
    }
}