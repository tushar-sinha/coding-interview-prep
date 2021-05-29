/*
  Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0

 */

 class Solution {
     public String longestStr(String str) {
         Set<Character> s = new HashSet<>();
         int slow = 0, fast =0;
         int max = 0;
         //, temp = "";
         while(j<str.length()) {
             char ch = str.charAt(j);
             if(!s.contains(ch)) {
                 //temp += ch+"";
                 max = Math.max(max, set.size());
                 s.add(ch);
                 j++;
             } else {
                 s.remove(str.charAt(i++));
                 //max = temp.compareTo(max) > 0 ? temp : max;
                 //temp = "";
             }
         }
         return max;    
     }
 }