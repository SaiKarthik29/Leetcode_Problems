class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int max=position[n-1];
        int min=position[0];
        int l=1,r=max-min;
        int k=0;
        int ans=0;
        while(l<=r){
            k=(l+r)/2;
            int tempballs=m;
            int lastBalled=position[0];
            tempballs--;
            for(int i=1;i<n;i++){
                if(tempballs==0){
                    break;
                }
                else if(position[i]-lastBalled>=k){
                    tempballs--;
                    lastBalled=position[i];
                }
            }
            if(tempballs==0){
                ans=k;
                l=k+1;
            }
            else if(tempballs!=0){
                r=k-1;
            }
        }
        return ans;       
    }
}