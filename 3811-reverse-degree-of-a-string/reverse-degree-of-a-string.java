class Solution {
    public int reverseDegree(String s) {
        int arr[]=new int[26];
        int num=26;
        for(int i=0;i<26;i++){
            arr[i]=num--;
        }
        int ind=1;
        int sum=0;
        for(char ch:s.toCharArray()){
            int revIndex=arr[ch-'a'];
            int product=revIndex*ind;
            sum+=product;
            ind++;
        }
        return sum;
    }
}