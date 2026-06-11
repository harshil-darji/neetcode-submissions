class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dfsPreOrder(p, q);
    }
    
    boolean dfsPreOrder(TreeNode t, TreeNode s) {
        // Case 1: Both null → same!
        if (t == null && s == null) {
            return true;
        }
        
        // Case 2: One null, one not null → different!
        if (t == null || s == null) {
            return false;
        }
        
        // Case 3: Values different → different!
        if (t.val != s.val) {
            return false;
        }
        
        // Case 4: Both not null and values equal → check children
        return dfsPreOrder(t.left, s.left) && dfsPreOrder(t.right, s.right);
    }
}