class Solution {
    public String reverseStr(String s, int k) {
        int length=s.length();
        StringBuilder sb=new StringBuilder(s);
        for(int start=0;start<length;start+=2*k){
            int end=Math.min(start+k,length);
            String part=new StringBuilder(sb.substring(start,end)).reverse().toString();
            sb.replace(start,end,part);
        }
        return sb.toString();
    }
}