// https://leetcode.com/problems/longest-common-prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int c=0;
        while(c<strs[0].length()) {
            if(strs[0].charAt(c) == strs[strs.length-1].charAt(c)) {
                c++;
            } else {
                break;
            }
        }
        return strs[0].substring(0,c);
    }
}