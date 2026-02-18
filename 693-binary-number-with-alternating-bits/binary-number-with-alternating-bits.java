class Solution {
    public boolean hasAlternatingBits(int n) {
        int prevBit=n%2;
        n=n/2;
        while(n>0){
            int currentBit=n%2;
            if(currentBit==prevBit){
                return false;
            }
            prevBit=currentBit;
            n=n/2;
        }
        return true;
    }
}