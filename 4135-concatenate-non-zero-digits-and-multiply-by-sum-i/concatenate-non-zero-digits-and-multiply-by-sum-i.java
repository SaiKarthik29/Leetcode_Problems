class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long place=1;
        long number=0;
        while(n>0){
            int rem=n%10;
            if(rem!=0){
                sum+=rem;
                number=rem*place+number;
                place=place*10;
            }
            n=n/10;
        }
        return number*sum;
    }
}