class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> temp=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0,candidates,target);
        return res;
    }
    private void backtrack(int idx,int [] c, int t){
        if(t==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<c.length;i++){
            if(c[i]>t){
                continue;
            }
            temp.add(c[i]);
            backtrack(i,c,t-c[i]);
            temp.remove(temp.size()-1);
        }
    }
}