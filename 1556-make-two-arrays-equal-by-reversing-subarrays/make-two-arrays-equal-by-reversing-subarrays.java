class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        for(int i=0;i<target.length;i++){
            map1.put(target[i],map1.getOrDefault(target[i],0)+1);
        }
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map2.put(arr[i],map2.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<target.length;i++){
            int num=target[i];
            int tarval=map1.get(num);
            if(map2.containsKey(num)){
                int arrval=map2.get(num);
                if(tarval==arrval){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}