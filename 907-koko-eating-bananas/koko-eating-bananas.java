class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,piles[i]);
        }
        long r=max,l=1;
        int cnt=1;
        while(l<=r){
            long k=(r+l)/2;
            long temp=0;
            for(int i=0;i<n;i++){
                if(temp>h){
                    break;
                }
                temp+=((piles[i]+k-1)/k);
            }
            if(temp<=h){
                r=k-1;
            }
            else if(temp>h){
                l=k+1;
            }
        }
        return (int)l;
    }
}