// https://leetcode.com/problems/reverse-string

class Solution {
    public void reverseString(char[] s) {
        int mid = (int)s.length/2;
        for(int i=0; i<mid; i++) {
            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
        for(int i = 0; i<s.length; i++) {
            if(i==0) {
                System.out.print("[\""+s[i]+"\""+",");
            } else if(i==s.length-1) {
                System.out.print("\""+s[i]+"\"]");
            } else {
                System.out.print("\""+s[i]+"\""+",");
            }
        }
    }
}