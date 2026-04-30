class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> temp=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(1,k,n);
        return res;
    }
    private void backtrack(int idx,int k, int n){
        if(n==0 && temp.size()==k){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<=9;i++){
            if(i>n){
                continue;
            }
            temp.add(i);
            backtrack(i+1,k,n-i);
            temp.remove(temp.size()-1);
        }
    }
}