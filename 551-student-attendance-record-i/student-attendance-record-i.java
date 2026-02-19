class Solution {
    public boolean checkRecord(String s) {
        int absent=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'){
                absent++;
            }
        }
        if(absent<2){
            for(int i=0;i<=s.length()-3;i++){
                char ch1=s.charAt(i);
                char ch2=s.charAt(i+1);
                char ch3=s.charAt(i+2);
                if(ch1 == 'L' && ch2=='L' && ch3=='L'){
                    return false;
                }
            }
            
        }
        else{
            return false;
        }
        return true;
    }
}