/**
Given a string s, return the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
 */

class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for(char ch : s.toCharArray()) {
            arr[ch-'a']++;
        }
        for(int i=0; i<s.length(); i++) {
            if(arr[s.charAt(i)-'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}

// =========================================

class Solution {
    public int firstUniqChar(String s) {
        for(int i=0; i<s.length(); i++) {
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) return i;
        }
        return -1;
    }
}