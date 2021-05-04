// https://leetcode.com/problems/power-of-three

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1) return false;
        while(n%3 == 0) {
            n /= 3;
        }
        return n==1;
    }
}

// ========================================

public class Solution {
    public boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}