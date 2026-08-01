class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        String str=sb.toString().toLowerCase();
        StringBuilder rev=new StringBuilder(str);
        rev=rev.reverse();
        return rev.toString().equals(str);
    }
}