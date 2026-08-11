class Solution {
    public String makeGood(String s) {
        Stack<Character> stk=new Stack<>();
        for(char ch:s.toCharArray()){
            boolean res=true;
            if(!stk.isEmpty()){
                
                if(Character.isUpperCase(ch)){
                    if(stk.peek()==Character.toLowerCase(ch)){
                        stk.pop();
                        res=false;
                    }
                }
                else{
                    if(Character.isUpperCase(stk.peek())){
                        if(Character.toLowerCase(stk.peek())==ch){
                            stk.pop();
                            res=false;
                        }
                    }
                }
                
            }
            
            if(res)
            stk.push(ch);
            
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:stk){
            sb.append(ch);
        }
        return sb.toString();
    }
}