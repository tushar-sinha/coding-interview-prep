// https://leetcode.com/problems/remove-duplicates-from-sorted-array

class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr =0;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] != nums[ptr]) {
                ptr++;
                nums[ptr] = nums[i];
            }
        }
        return ptr+1;
    }
}