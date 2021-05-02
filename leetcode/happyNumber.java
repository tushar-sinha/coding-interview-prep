// https://leetcode.com/problems/happy-number

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while(n != 0) {
            int sum = 0;
            while(n>0) {
                int lastd = n%10;
                sum += lastd*lastd;
                n = n/10;
            }
            if(sum == 1) {
                return true;
            }
            if(s.contains(sum)) {
                break;
            } else {
                s.add(sum);
            }
            n = sum;
        }
        return false;
    }
}