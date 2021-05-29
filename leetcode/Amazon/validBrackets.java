
/**
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
 */

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