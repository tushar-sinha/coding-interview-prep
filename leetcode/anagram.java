//  https://leetcode.com/problems/valid-anagram

import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alpha = new int[26];
        
        for(int i=0; i<s.length(); i++) {
            alpha[s.charAt(i)-'a'] += 1;
        }
        for(int i=0; i<t.length(); i++) {
            
            alpha[t.charAt(i)-'a'] -= 1;
        }
        for(int a : alpha) {
            if(a != 0) {
                return false;
            }
        }
        return true;
    }
}