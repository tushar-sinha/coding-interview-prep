// https://leetcode.com/problems/excel-sheet-column-number

import java.util.HashMap;

class Solution {
    public int titleToNumber(String columnTitle) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int count = 1;
        for(int i=65; i<=90; i++) {
            hm.put((char)i, count++);
        }
        int res = 0;
        int pow = 1;
        for(int i = columnTitle.length()-1; i>=0; i--) {
            char ch = columnTitle.charAt(i);
            res += hm.get(ch) * pow;
            pow = pow*26;
        }
        return res;
    }
}

// -------------------------------------------------------

// WITH OPTIMIZATION

import java.util.HashMap;

class Solution {
    public int titleToNumber(String columnTitle) {
        // HashMap<Character,Integer> hm = new HashMap<>();
        // int count = 1;
        // for(int i=65; i<=90; i++) {
        //     hm.put((char)i, count++);
        // }
        int res = 0;
        int pow = 1;
        char[] arr = columnTitle.toCharArray();
        for(int i=arr.length-1; i>=0; i-- ) {
            // char ch = columnTitle.charAt(i);
            res += ((int)arr[i]-'A'+1) * pow;
            pow = pow*26;
        }
        return res;
    }
}