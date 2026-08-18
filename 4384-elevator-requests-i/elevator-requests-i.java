class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int cnt=0;
        int floor=0;
        for(int i=0;i<requests.length;i++){
            if(floor==requests[i]){
                continue;
            }
            else{
                
                cnt+=Math.abs(floor-requests[i]);
                floor=requests[i];
            }
        }
        return cnt;
    }
}