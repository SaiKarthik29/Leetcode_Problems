class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(2*arr[i]);
        }
        int cnt=0;
        for(int num:arr){
            if(num==0){
                cnt++;
            }
        }
        if(cnt>1){
            return true;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && set.contains(arr[i])){
                return true;
            }
        }
        return false;
    }
}