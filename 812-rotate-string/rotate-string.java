class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb=new StringBuilder(s);
        StringBuilder g=new StringBuilder(goal);
        for(int i=0;i<s.length();i++){
            char ch=sb.charAt(i);
            char removedChar=sb.charAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
            sb.insert(0,removedChar);
            if(sb.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
}