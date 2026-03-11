class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        String binary="";
        int temp=n;
        while(temp!=0){
            binary=(temp%2)+binary;
            temp=temp/2;
        }
        String flip="";
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                flip+='0';
            }
            else{
                flip+='1';
            }
        }
        int res=0;
        int power=1;
        for(int i=flip.length()-1;i>=0;i--){
            if(flip.charAt(i)=='1'){
                res=res+power;
            }
            power=power*2;
        }
        return res;
    }
}