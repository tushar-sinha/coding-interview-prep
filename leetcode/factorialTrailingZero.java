// https://leetcode.com/problems/factorial-trailing-zeroes

class Solution {
    public int trailingZeroes(int n) {
        //int fac = factorial(n);
        int count = 0;
        while (n !=0) {
            n /= 5;
            count += n;
        }
        return count;
    }
}