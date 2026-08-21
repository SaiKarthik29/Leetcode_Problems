class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map=new HashMap<>();
        String words1[]=s1.split(" ");
        String words2[]=s2.split(" ");
        for(String word:words1){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String word:words2){    
            map.put(word,map.getOrDefault(word,0)+1);           
        }
        ArrayList<String> lst=new ArrayList<>();
        for(String word:map.keySet()){
            int val=map.get(word);
            if(val==1){
                lst.add(word);
            }
        }
        return lst.toArray(new String[0]);
    }
}