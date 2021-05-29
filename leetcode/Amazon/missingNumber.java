/**
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?

 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 */

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int tempSum = 0;
        for(int num : nums) {
            tempSum += num;
        }
        return sum - tempSum;
    }
}

//=========================================

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        if (nums[nums.length-1] != nums.length) {
            return nums.length;
        }
        // Ensure that 0 is at the first index
        else if (nums[0] != 0) {
            return 0;
        }
        for(int i = 0; i<nums.length; i++) {
            if(count++ != nums[i]) return count-1;
        }
        return -1;
    }
}
//============================================

class Solution {
    public int missingNumber(int[] nums) {
        int missed = nums.length;
        for(int i = 0; i<nums.length; i++) {
            missed ^= i^nums[i];
        }
        return missed;
    }
}