class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr2){
            set.add(i);
        }
        ArrayList<Integer> list=new ArrayList<>();
        int res[]=new int[arr1.length];
        for(int i:arr1){
            if(set.contains(i)){
                map.put(i,map.getOrDefault(i,0)+1);
            }
            else{
                list.add(i);
            }
        }
        Collections.sort(list);
        int ind=0;
        for(int i=0;i<arr2.length;i++){
            int num=arr2[i];
            int value=map.get(num);
            for(int j=0;j<value;j++){
                res[ind]=num;
                ind++;
            }
        }
        for(int i:list){
            res[ind]=i;
            ind++;
        }
        return res;
    }
}