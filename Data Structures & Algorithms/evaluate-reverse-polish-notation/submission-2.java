class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for(String s : tokens) {
            if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                st.push(s);
            }
            else {
                int b = Integer.parseInt(st.pop());
                int a = Integer.parseInt(st.pop());
                int res = 0;
                switch (s) {
                    case "+": res = a + b; break;
                    case "-": res = a - b; break;
                    case "*": res = a * b; break;
                    case "/": res = a / b; break;
                }
                st.push(Integer.toString(res));
            }
        }
        return Integer.parseInt(st.pop());
    }
}
