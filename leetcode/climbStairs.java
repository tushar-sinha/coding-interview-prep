//https://leetcode.com/problems/climbing-stairs/

import java.util.Hashtable;
class Solution {
    Hashtable<Integer, Integer> ht = new Hashtable<>();
    public int climbStairs(int n) {
        if(n==1) {
            return 1;
        }
        if(n==2) {
            return 2;
        }
        
        if(ht.get(n) == null) {
            int temp = climbStairs(n-1) + climbStairs(n-2);
            ht.put(n, temp);
        }
        return ht.get(n);
    }
}