/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> outer=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return outer;
        q.offer(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int s=q.size();
            ArrayList<Integer> inner=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode curr=q.poll();
                if(flag){
                    inner.add(curr.val);
                }
                else{
                    inner.add(0,curr.val);
                }
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            outer.add(inner);
            flag=!flag;
        }
        return outer;
    }
}