// https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int runningSum = 0;
        int ptr = 0;
        for(int i=0; i<nums.length; i++) {
            runningSum = Math.max(runningSum+nums[i], nums[i]);
            sum = Math.max(sum, runningSum);
        }
        return sum;
    }
}

// ==================================================
// BRUTE FORCE O(N^3)

class Solution {
    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            for(int j=i;j<nums.length; j++) {
                int sum = 0;
                for(int k=i; k<=j;k++) {
                    sum +=nums[k];
                }
                res = Math.max(sum, res);
            }
        }
        return res;
    }
}
// ==================================================
// BRUTE FORCE(OPTIMIZED)

class Solution {
public int maxSubArray(int[] nums) {
  int n = nums.length;
  int maxSum = Integer.MIN_VALUE; // can't be 0
  for (int i = 0; i < n; ++i) { // starts at i
    int sum = nums[i];
    maxSum = Math.max(maxSum, sum);
    for (int j = i + 1; j < n; ++j) { // starts from the next element
      sum += nums[j];
      maxSum = Math.max(maxSum, sum);
    }
  }
  return maxSum;
}
}

/*


DP
Suppose we know the maximum subarray ending at i (inclusive). We denote SUM(i) as the maximum sum of a subarray ending at index i and denote OPT(i) as the maximum sum in the subarray [0, i]. Our final result is OPT(n - 1). (notice the difference since it is very trivial)

For an element nums[i], we have two choices: Appending it to a previous subarray SUM(i - 1) or start a new subarray from itself. Then we can write the recurrence for SUM(i) and OPT(i) as follows:

SUM(i) = max(SUM(i - 1) + nums[i], nums[i])
OPT(i) = max(OPT(i - 1), SUM(i)).

Note: OPT is updated when a larger SUM[i] is discovered.

The initial values are SUM(0) = nums[0] and OPT(0) = nums[0]. We can do it in one pass. So here is the code:

public int maxSubArray(int[] nums) {
  int n = nums.length;
  int[] SUM = new int[n];
  int[] OPT = new int[n];
  SUM[0] = nums[0]; // init
  OPT[0] = nums[0];
  for (int i = 1; i < n; ++i) {
    SUM[i] = Math.max(SUM[i - 1] + nums[i], nums[i]);
    OPT[i] = Math.max(OPT[i - 1], SUM[i]);
  }
  return OPT[n - 1];
}
Since SUM(i) and OPT(i) could be calculated by the previous values, we don't need arrays of size n to store all information. Here is the code that reduces the space complexity:

public int maxSubArray(int[] nums) {
  int n = nums.length;
  int SUM = nums[0];
  int OPT = nums[0];
  for (int i = 1; i < n; ++i) {
    SUM = Math.max(SUM + nums[i], nums[i]);
    OPT = Math.max(OPT, SUM);
  }
  return OPT;
}
Time: O(N)
Space: O(1)


*/