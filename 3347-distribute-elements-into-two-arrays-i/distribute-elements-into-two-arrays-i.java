class Solution {
    public int[] resultArray(int[] nums) {
       ArrayList<Integer> lst1=new ArrayList<>();
       ArrayList<Integer> lst2=new ArrayList<>();
       lst1.add(nums[0]);
       lst2.add(nums[1]);
       for(int i=2;i<nums.length;i++){
           int lastEle1=lst1.get(lst1.size()-1);
           int lastEle2=lst2.get(lst2.size()-1);
           if(lastEle1>lastEle2){
            lst1.add(nums[i]);
           }
           else{
            lst2.add(nums[i]);
           }
       }
       int ind=0;
       int arr[]=new int[lst1.size()+lst2.size()];
       for(int i=0;i<lst1.size()+lst2.size();i++){
        if(i<lst1.size()){
            arr[i]=lst1.get(i);
        }
        else{
            arr[i]=lst2.get(ind++);
        }
       }
       return arr;
    }
}