class Solution {
    public String addStrings(String num1, String num2) {
        int idx1=num1.length()-1;
        int idx2=num2.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(idx1>=0 || idx2>=0 || carry!=0){
            int frstNumber=0;
            if(idx1>=0){
                frstNumber=num1.charAt(idx1)-'0';
                idx1--;
            }
            int secNo=0;
            if(idx2>=0){
                secNo=num2.charAt(idx2)-'0';
                idx2--;
            }
            int sum=frstNumber+secNo+carry;
            int d=sum%10;
            carry=sum/10;
            sb.append(d);
        }
        return sb.reverse().toString();
    }
}