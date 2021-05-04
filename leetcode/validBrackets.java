// https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        String left = "{[(";
        String right = "}])";
        Stack<Character> st = new Stack<>();
        for (char ch:s.toCharArray()) {
            if(left.indexOf(ch) >=0) {st.push(ch);}
            else if(st.isEmpty() || left.indexOf(st.pop()) != right.indexOf(ch)) {
                return false;
            }
        }
        return st.isEmpty();
    }
}