class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root != null)
            queue.offer(root);

        while(!queue.isEmpty()){
            int s = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i=0; i<s; i++){
                TreeNode t = queue.poll();
                temp.add(t.val);
                if (t.left != null)
                    queue.offer(t.left);
                if (t.right != null)
                    queue.offer(t.right);
            }
            result.add(temp);
        }

        return result;
    }
}