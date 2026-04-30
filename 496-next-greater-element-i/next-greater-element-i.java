class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> nge=new HashMap<>();
        Stack<Integer> stk=new Stack<>();
        for(int x:nums2){
            while(!stk.isEmpty() && stk.peek()<x){
                nge.put(stk.pop(),x);
            }
            stk.push(x);
        }
        while(!stk.isEmpty()){
            nge.put(stk.pop(),-1);
        }
        int res[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=nge.get(nums1[i]);
        }
        return res;
    }
}