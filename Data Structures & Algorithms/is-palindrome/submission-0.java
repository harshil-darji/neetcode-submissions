class Solution {
    public boolean isPalindrome(String s) {
        String modiString = "";
        for (char ch: s.toCharArray()) {
            int ascii = (int) ch;
            if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122) || (ascii>=48 && ascii<=57)) {
                modiString += Character.toLowerCase(ch);
            }
        }
        int len = modiString.length();
        int half = len/2;
        for (int i=0; i<half; i++) {
            if (modiString.charAt(i) != modiString.charAt(len - i - 1))
                return false;
        }
        return true;
    }
}
