class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt=0,sum=0,left=0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            if(right-left+1==k){
                if(sum/k >= threshold){
                    cnt++;
                }
                sum=sum-arr[left];
                left++;
            }
        }
        return cnt;
    }
}