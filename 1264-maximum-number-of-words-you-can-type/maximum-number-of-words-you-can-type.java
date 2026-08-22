class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String words[]=text.split(" ");
        HashSet<Character> set=new HashSet<>();
        for(char ch:brokenLetters.toCharArray()){
            set.add(ch);
        }
        int cnt=0;
        for(String word:words){
            boolean typed=true;
            for(int i=0;i<word.length();i++){
                if(set.contains(word.charAt(i))){
                    typed=false;
                    break;
                }
            }
            if(typed){
                cnt++;
            }
        }
        return cnt;
    }
}