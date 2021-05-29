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

//  ===============================================

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        Set<Character> set = new HashSet<>();
        int i=0,j=0,max=0;
        while(j<s.length()) {
            
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                max = Math.max(max, set.size());
                j++;
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
/*

    explaination: keep on adding in set till no repeated element found

    if any repeation found, keep on moving the slow pointer till the repeated element is removed from set

    position of j freezes till the repeatition element is removed
 */