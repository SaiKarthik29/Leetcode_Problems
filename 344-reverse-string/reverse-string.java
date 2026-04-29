class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length;
        int n=s.length;
        while(i<j){
            char temp=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=temp;
            i++;
            j--;
        }
    }
}