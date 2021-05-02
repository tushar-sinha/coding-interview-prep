// https://leetcode.com/problems/first-unique-character-in-a-string

class Solution {
    public int firstUniqChar(String s) {
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            boolean repeat = false;
            for(int j=0; j<s.length(); j++) {
                if(i == j) {
                    continue;
                }
                if(ch == s.charAt(j)) {
                    repeat = true;
                    break;
                }
            }
            if(!repeat) {return i;}
        }
        return -1;
    }
}

// -------------------------------------------------------------------

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
