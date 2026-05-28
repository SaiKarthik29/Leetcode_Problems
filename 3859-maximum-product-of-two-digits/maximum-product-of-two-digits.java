class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> res=new ArrayList<>();
        while(n>0){
            int lastdigit =n%10;
            res.add(lastdigit);
            n=n/10;
        }
        Collections.sort(res);
        int lastdigit=res.get(res.size()-1);
        int Seclastdigit=res.get(res.size()-2);
        return lastdigit*Seclastdigit;
    }
}