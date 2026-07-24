class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder x=new StringBuilder();
        long sum=0;
        while(n>0){
            int rem=n%10;
            if(rem!=0){
                x.append(Integer.toString(rem));
                sum+=rem;
            }
            n=n/10;
        }
        if(x.length()==0){
            return 0;
        }
        int temp=Integer.parseInt(x.reverse().toString());
        return temp*sum;
    }
}