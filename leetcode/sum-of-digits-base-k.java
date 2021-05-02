https://leetcode.com/problems/sum-of-digits-in-base-k/

class Solution {
    public int sumBase(int n, int k) {
        int power =1;
        int rem = 0;
        int res = 0;
        while(n!=0) {
            rem = n%k;
            n = n/k;
            res = res + rem*power;
            power = power * 10;
        }
        int sum = 0;
        while(res!=0) {
            int end = res%10;
            sum += end;
            res = res/10;
        }
        return sum;
    }
}