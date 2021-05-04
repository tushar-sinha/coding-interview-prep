// https://leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            int num = target-nums[i];
            for(int j=i+1;j<nums.length; j++) {
                if(nums[j] == num) {
                    int[] arr = new int[2];
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return new int[0];
    }
}

// =================================================

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
    }
}