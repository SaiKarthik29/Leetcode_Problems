class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int temp[]=score.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(score[i],i);
        }
        int idx=4;
        String result[]=new String[n];
        for(int i=n-1;i>=0;i--){
            int originalIdx=map.get(temp[i]);
            if(i==n-1){
                result[originalIdx]="Gold Medal";
            }
            else if(i==n-2){
                result[originalIdx]="Silver Medal";
            }
            else if(i==n-3){
                result[originalIdx]="Bronze Medal";
            }
            else{
                result[originalIdx]=String.valueOf(idx);
                idx++;
            }
        }
        return result;
    }
}