// https://leetcode.com/problems/rotate-array

class Solution {
    public void rotate(int[] nums, int k) {
        Queue<Integer> q = new LinkedList<>();
        int count = nums.length-1;
        if(nums.length <= 1 ) return;
        if(k>nums.length) k = k%nums.length;
        while(count>(nums.length-k-1)) {// 7 -2 -1 = 4
            q.add(nums[count--]);
        }
        // shifting elements from k to end
        int pos = nums.length-1;
        for(int i=nums.length-k-1; i>=0; i--) {
            nums[pos--] = nums[i];
        }
        // System.out.println(Arrays.toString(nums));
        count = k-1;
        while(!q.isEmpty() && count>=0) {
            nums[count--] = q.remove();
        }
        
    }
}

// ================================================
/*
This approach is based on the fact that when we rotate the array k times,
 k%nk elements from the back end of the array come to the front and 
 the rest of the elements from the front shift backwards.

In this approach, we firstly reverse all the elements of the array.
Then, reversing the first k elements followed by reversing the rest n-kn−k elements gives us the required result.

Let n = 7 and k = 3.

Original List                   : 1 2 3 4 5 6 7
After reversing all numbers     : 7 6 5 4 3 2 1
After reversing first k numbers : 5 6 7 4 3 2 1
After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result
 */
class Solution {
  public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
  }
  public void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }
}