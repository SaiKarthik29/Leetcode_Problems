class Solution {
    public void reverseString(char[] s) {
        int size=s.length/2;
        int n=s.length;
        for(int i=0;i<size;i++){
            char t1=s[i];
            char t2=s[n-i-1];
            s[i]=t2;
            s[n-i-1]=t1;
        }
        
    }
}