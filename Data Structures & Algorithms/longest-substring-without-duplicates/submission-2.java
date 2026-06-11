class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        HashSet<Character> hs = new HashSet<>();
        int l = 0, r = 0, max = 0;

        while (r < s.length()) {
            char ch = s.charAt(r);

            if (!hs.contains(ch)) {
                hs.add(ch);
                r++;
                max = Math.max(max, hs.size());
            } else {
                hs.remove(s.charAt(l));
                l++;
            }
        }

        return max;
    }
}
