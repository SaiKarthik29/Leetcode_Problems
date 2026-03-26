class Solution {
    public int maxVowels(String s, int k) {
        int cnt=0,max=0,left=0;
        for(int right=0;right<s.length();right++){
            if(isVowel(s.charAt(right))){
                cnt++;
            }
            if(right-left+1==k){
                max=Math.max(max,cnt);
                if(isVowel(s.charAt(left))){
                    cnt--;
                }
                left++;
            }
        }
        return max;
    }
    private boolean isVowel(char ch){
            return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}