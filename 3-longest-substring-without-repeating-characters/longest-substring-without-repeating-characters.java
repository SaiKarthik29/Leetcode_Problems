class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.isEmpty()) return 0;
        int ws=0;
        int we=0;
        int n=s.length();
        int max=0;
        HashSet<Character> set=new HashSet<>();
        while(we<n){
            char ch=s.charAt(we);
            if(!set.contains(ch)){
                set.add(ch);
            }
            else{
                while(set.contains(ch)){
                    set.remove(s.charAt(ws));
                    ws++;
                }
                set.add(s.charAt(we));
            }
            max=Math.max(max,we-ws+1);
            we++;
        }
        return max;
    }
}