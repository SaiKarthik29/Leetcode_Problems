class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int num:apple){
            sum+=num;
        }
        Arrays.sort(capacity);
        int cnt=0;
        int capsum=0;
        for(int i=capacity.length-1;i>=0;i--){
            if(capsum>=sum){
                break;
            }
            capsum+=capacity[i];
            cnt++;
        }
        return cnt;
    }
}