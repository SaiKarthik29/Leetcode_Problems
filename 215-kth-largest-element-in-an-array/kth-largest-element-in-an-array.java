class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums){
            pq.offer(i);
        }
        int r=nums.length-k;
        while(r-->0){
            pq.poll();
        }
        return pq.peek();
    }
}