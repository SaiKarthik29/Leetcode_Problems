class Solution {
    public String longestNiceSubstring(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                if(isNice(sub) && sub.length()>ans.length()){
                    ans=sub;
                }
            }
        }
        return ans;
    }
    public boolean isNice(String str){
        for(char c:str.toCharArray()){
            if(Character.isLowerCase(c) && !str.contains(""+Character.toUpperCase(c))){
                return false;

            }
            if(Character.isUpperCase(c) && !str.contains(""+Character.toLowerCase(c))){
                return false;
            }
        }
        return true;
    }
}