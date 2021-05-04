// https://leetcode.com/problems/plus-one

class Solution {
    public int[] plusOne(int[] digits) {
        int last = digits.length-1;
        for(int i=last; i>=0; i--) {
            if(digits[i] != 9) {
                digits[i] ++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] res = new int[digits.length+1];
        res[0]=1;
        return res;
    }
}