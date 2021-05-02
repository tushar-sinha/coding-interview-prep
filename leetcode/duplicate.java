// https://leetcode.com/problems/contains-duplicate

import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap<>();
        
        for(int i=0;i<nums.length;i++) {
            if(hm.get(nums[i]) != null) {
                return true;
            } else {
                hm.put(nums[i], true);
            }
        }
        return false;
    }
}

----------------------------------------------------------

// Set does not contain duplicates

import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        //         Set<Integer> set = new HashSet<>(Arrays.asList(nums));
        return set.size() < nums.length;
    }
}