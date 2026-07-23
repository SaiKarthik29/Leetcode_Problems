class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res=new ArrayList<>();
        for(int i=0;i<words.size();i++){
            String text=words.get(i);
            String temp[]=text.split("\\"+separator);
            for(int j=0;j<temp.length;j++){
                if(temp[j].length()!=0)
                    res.add(temp[j]);
            }
        }
        return res;
    }
}