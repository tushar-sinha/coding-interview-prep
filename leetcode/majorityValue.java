// https://leetcode.com/problems/majority-element/
import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i< nums.length; i++) {
            if(hm.get(nums[i]) == null) {
                hm.put(nums[i], 1);
            } else {
                int val = hm.get(nums[i]);
                hm.put(nums[i], val+1);
            }
        }
        return hm.entrySet().stream().max((entry1, entry2) -> entry1.getValue()>entry2.getValue() ?1:-1).get().getKey();
    }
}

// ---------------------------------------------------------------------------------


class Solution {
    public int majorityElement(int[] nums) {
        int count =0, res =0;
        for(int num : nums) {
            if(count == 0) {
                res = num;
            }
            if(num != res) {
                count--;
            } else {
                count++;
            }
        }
        return res;
    }
}