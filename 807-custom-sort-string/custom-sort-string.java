class Solution {
    public String customSortString(String order, String s) {
        HashSet<Character> unique=new HashSet<>();
        for(char c:s.toCharArray()){
            unique.add(c);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<order.length();i++){
            if(unique.contains(order.charAt(i))){
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)==order.charAt(i)){
                        sb.append(s.charAt(j));
                    }
                }
            }
        }
        HashSet<Character> remaining=new HashSet<>();
        for(char c:sb.toString().toCharArray()){
            remaining.add(c);
        }

        for(int i=0;i<s.length();i++){
            if(!remaining.contains(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}