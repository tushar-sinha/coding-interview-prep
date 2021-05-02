// https://leetcode.com/problems/roman-to-integer


import java.util.*;
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        char prev = s.charAt(0);
        int val = 0;
        for(char ch : s.toCharArray()) {
          if(hm.get(ch) > hm.get(prev)) {
              val += hm.get(ch) - 2* hm.get(prev);
          } else {
              val += hm.get(ch);
          }
            prev = ch;
        }
        return val;
    }
}