class Solution {
    public int numberOfSpecialChars(String word) {
        int lowerLetter[]=new int[26];
        int upperLetter[]=new int[26];
        Arrays.fill(lowerLetter,-1);
        Arrays.fill(upperLetter,-1);
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                lowerLetter[ch-'a']=i;
            }else{
                if(upperLetter[ch-'A']==-1){
                    upperLetter[ch-'A']=i;
                }
            }
        }
        int cnt=0;
        for(int i=0;i<26;i++){
            if(lowerLetter[i]!=-1 && upperLetter[i]!=-1){
                if(lowerLetter[i]<upperLetter[i]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}