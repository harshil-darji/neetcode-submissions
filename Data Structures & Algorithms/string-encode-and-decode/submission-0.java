class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for (String str : strs) {
            result += str + "π";
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        String current = "";
        
        for (char c : str.toCharArray()) {
            if (c == 'π') {
                result.add(current);
                current = "";
            } else {
                current += c;
            }
        }
        
        return result;
    }
}
