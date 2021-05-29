/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/
// ---------------Two Pass Hash Map---------------------------
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
                hm.put(nums[i], i);
        }
        System.out.println(hm.entrySet());
        for(int i=0; i<nums.length; i++) {
            if(hm.containsKey(target - nums[i]) && hm.get(target - nums[i]) != i) {
                
                return new int[] {i, hm.get(target-nums[i])};
            }
        }
        return new int[0];
        //     throw new IllegalArgumentException("No two sum solution");
    }
}
// ---------------One Pass Hash Map---------------------------
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(hm.containsKey(complement)) {
                return new int[] {hm.get(complement), i};
            }
            hm.put(nums[i], i);
        }
        return new int[0];
    }
}