class Solution {
    public int reverseDegree(String s) {
        int ind=1;
        int sum=0;
        for(char ch:s.toCharArray()){
            int revIndex=26-(ch-'a');
            int product=revIndex*ind;
            sum+=product;
            ind++;
        }
        return sum;
    }
}