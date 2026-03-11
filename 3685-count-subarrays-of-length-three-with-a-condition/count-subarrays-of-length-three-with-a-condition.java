class Solution {
    public int countSubarrays(int[] arr) {
        int len=arr.length;
        int count=0;
        for(int i=0;i<=len-3;i++){
            if(arr[i+1]==2*(arr[i]+arr[i+2])){
                count++;
            }
        }
        return count;
    }
}