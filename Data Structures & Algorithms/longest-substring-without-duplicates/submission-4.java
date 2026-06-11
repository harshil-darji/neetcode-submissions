class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        if (s.length() == 0)
            return 0;
        int l=0; int r=1;
        hs.add(s.charAt(l));
        int max = 1;
        while(r < s.length()) {
            char ch = s.charAt(r);
            if (!hs.contains(ch)) {
                hs.add(ch);
                if (hs.size() >= max)
                    max = hs.size();
                r++;
            } else {
                hs.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}
