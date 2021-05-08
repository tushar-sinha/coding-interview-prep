// https://leetcode.com/problems/longest-substring-without-repeating-characters

// =================BRUTE FORCE=========================

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        // trying with sliding window
        int max = 0;
        for(int i=0; i<s.length(); i++) {
            String str = "";
            for(int j=i; j<s.length(); j++) {
                char ch = s.charAt(j);
                if(str.indexOf(ch) < 0) {
                    str += ""+ch;
                    max = Math.max(str.length(), max);
                } else {
                    break;
                }
            }
        }
        return max;
    }
}

// ===================================================

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        String str = "";
        int max = 0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(str.indexOf(ch) < 0) {
                str += ""+ch;
                max = Math.max(str.length(),max);
            } else {
                str = str.substring(str.indexOf(ch)+1) + ch;
            }
        }
        return Math.max(max, str.length());
    }
}