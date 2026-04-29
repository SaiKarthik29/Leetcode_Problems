class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                if(Character.isUpperCase(ch)){
                    sb.append(Character.toLowerCase(ch));
                }
                else{
                    sb.append(ch);
                }
            }         
        }
        String rev=new StringBuilder(sb).reverse().toString();
        return sb.toString().equals(rev);
    }
}