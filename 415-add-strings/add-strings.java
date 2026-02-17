class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int index1=num1.length()-1;
        int index2=num2.length()-1;
        int carry=0;
        while(index1>=0 || index2>=0 || carry!=0){
            int frstNumber=0;
            if(index1>=0){
                frstNumber=num1.charAt(index1)-'0';
                index1--;
            }
            int secondNumber=0;
            if(index2>=0){
                secondNumber=num2.charAt(index2)-'0';
                index2--;
            }
            int sum=frstNumber+secondNumber+carry;
            int digitToWrite=sum%10;
            carry=sum/10;
            sb.append(digitToWrite);
        }
        return sb.reverse().toString();
    }
}