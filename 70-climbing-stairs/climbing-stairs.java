class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int way2=1,way1=2;
        for(int i=2;i<n;i++){
            int curr=way1+way2;
            way2=way1;
            way1=curr;
        }
        return way1;
    }
}