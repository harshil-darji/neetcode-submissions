class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0, j=0, k=0;
        char[] result = new char[word1.length()+word2.length()];

        while (i<word1.length() && j<word2.length()) {
            result[k++] = word1.charAt(i++);
            result[k++] = word2.charAt(j++);
        }

        while (i<word1.length())
            result[k++] = word1.charAt(i++);
        while (j<word2.length())
            result[k++] = word2.charAt(j++);
        
        return new String(result);
    }
}