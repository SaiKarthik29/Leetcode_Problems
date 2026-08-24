class Solution {
    public boolean checkDivisibility(int n) {
        long sum=0;
        long prod=1;
        int temp=n;
        while(temp>0){
            long rem=temp%10;
            sum+=rem;
            prod=prod*rem;
            temp/=10;
        }
        long tsum=sum+prod;
        if(n%tsum==0){
            return true;
        }
        return false;
    }
}