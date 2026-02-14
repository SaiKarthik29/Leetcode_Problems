class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length-1;i++){
            int greaterVal=-1;
            for(int j=i+1;j<nums2.length;j++){
                if(nums2[j]>nums2[i]){
                    greaterVal=nums2[j];
                    break;
                }
            }
            if(greaterVal!=-1){
                map.put(nums2[i],greaterVal);
            }else{
                map.put(nums2[i],-1);
            }
        }
        map.put(nums2[nums2.length-1],-1);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(map.get(nums1[i]));
        }
        int n=list.size();
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}