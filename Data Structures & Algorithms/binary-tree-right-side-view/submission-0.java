class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque();
        q.offer(root);
        while (!q.isEmpty()){
            int s = q.size();
            int element = -1;
            for (int i=0; i<s; i++){
               TreeNode t = q.poll();
               element = t.val;
               if (t.left != null)
                q.offer(t.left);
               if (t.right != null)
                q.offer(t.right);
            }
            if (element != -1)
                res.add(element);
        }
        return res;
    }
}
