// https://leetcode.com/problems/move-zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        for(int num : nums) {
            if(num != 0) {
                nums[pos++] = num;
            }
        }
        for(int i=pos; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}