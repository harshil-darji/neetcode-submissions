class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] postfix = new int[len];
        prefix[0] = 1;
        postfix[len-1] = 1;

        for (int i=1; i<len; i++) {
            prefix[i] = nums[i-1] * prefix[i-1];
        }
        for (int j=len-2; j>=0; j--) {
            postfix[j] = postfix[j+1]*nums[j+1];
        }

        int [] res = new int[len];
        for (int i=0; i<len; i++) {
            res[i] = prefix[i] * postfix[i];
        }

        return res;
    }
}