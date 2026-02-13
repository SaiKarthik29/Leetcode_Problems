class Solution {
    public int numberOfSpecialChars(String word) {
        int lowerLetters[]=new int[26];
        int upperLetters[]=new int[26];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                lowerLetters[ch-'a']++;
            }else{
                upperLetters[ch-'A']++;
            }
        }
        int cnt=0;
        for(int i=0;i<26;i++){
            if(lowerLetters[i]>0 && upperLetters[i]>0){
                cnt++;
            }
        }
        return cnt;
    }
}