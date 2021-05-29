/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []
 

Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        Set<String> s = new HashSet<>();
        for(int i=0;i<nums.length-2; i++) {
            for(int j=i+1;j<nums.length-1;j++) {
                for(int k=j+1;k<nums.length;k++) {
                    int Ii= nums[i], Jj = nums[j], Kk = nums[k];
                    if(Ii + Jj + Kk == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(Ii);
                        temp.add(Jj);
                        temp.add(Kk);
                        int max = Math.max(Ii, Math.max(Jj,Kk));
                        int min = Math.min(Ii, Math.min(Jj,Kk));
                        int mid = -(max+min);
                        String hash = String.valueOf(min) + String.valueOf(mid) + String.valueOf(max);
                        if(!s.contains(hash)) {
                            s.add(hash);
                            al.add(temp);
                        }
                    }
                }
            }
        }
        return al;
    }
}

// =====================================================================================================

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSumII(nums, i, res);
            }
        return res;
    }
    void twoSumII(int[] nums, int i, List<List<Integer>> res) {
        int lo = i + 1, hi = nums.length - 1;
        while (lo < hi) {
            int sum = nums[i] + nums[lo] + nums[hi];
            if (sum < 0) {
                ++lo;
            } else if (sum > 0) {
                --hi;
            } else {
                res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                while (lo < hi && nums[lo] == nums[lo - 1])
                    ++lo;
            }
        }
    }
}