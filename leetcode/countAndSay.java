// https://leetcode.com/problems/count-and-say/

class Solution {
    public String countAndSay(int n) {
        if(n==1) {
            return "1";
        }
        String res = countAndSay(n-1) + "0";
        StringBuilder ans = new StringBuilder();
        for(int i=0,c=1; i<res.length()-1; i++,c++) {
            if(res.charAt(i) != res.charAt(i+1)) {
                ans.append(c).append(res.charAt(i));
                c=0;
            }
        }
        return String.valueOf(ans);
    }
}