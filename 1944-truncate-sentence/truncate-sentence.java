class Solution {
    public String truncateSentence(String s, int k) {
        String words[]=s.split(" ");
        boolean frst=true;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            if(!frst){
                sb.append(" ");
            }
            sb.append(words[i]);
            frst=false;
        }
        return sb.toString();
    }
}