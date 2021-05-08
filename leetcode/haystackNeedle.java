// https://leetcode.com/problems/implement-strstr/

class Solution {
    public int strStr(String haystack, String needle) {
        
        int l = needle.length();
        
        if(l==0) return 0;
        if(haystack.length()<needle.length()) return -1;
        
        for(int i=0; i<= haystack.length()-l; i++) {
            if(haystack.substring(i,i+l).compareTo(needle) == 0) {
                return i;
            }
        }
        return -1;
    }
}