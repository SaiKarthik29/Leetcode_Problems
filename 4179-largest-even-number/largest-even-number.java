class Solution {
    public String largestEven(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=sb.length()-1;i>=0;i--){
            int digit=(int)sb.charAt(i);
            if(digit%2!=0){
                sb.deleteCharAt(i);
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}