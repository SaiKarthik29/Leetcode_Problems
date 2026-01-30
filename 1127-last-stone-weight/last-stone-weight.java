class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int s:stones){
            pq.add(s);
        }
        while(pq.size()>1){
            int mx1=pq.remove();
            int mx2=pq.remove();
            if(mx1!=mx2){
                pq.add(mx1-mx2);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }
        return pq.peek();
    }
}