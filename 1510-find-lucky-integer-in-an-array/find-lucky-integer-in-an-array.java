class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> lst=new ArrayList<>(map.entrySet());
        Collections.sort(lst, (a,b)-> b.getKey()-a.getKey());
        for(Map.Entry<Integer,Integer> entry:lst){
            if(entry.getKey().equals(entry.getValue())){
                return entry.getKey();
            }
        }
        return -1;
    }
}