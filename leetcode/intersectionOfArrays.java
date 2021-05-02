// https://leetcode.com/problems/intersection-of-two-arrays-ii
// BRUTE FORCE
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        String res = "";
        for(int i=0; i<nums1.length; i++) {
            for(int j=0; j<nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    res += nums1[i] + " ";
                    nums2[j] = -1;
                    break;
                }
            }
        }
        if(res == "") {
            
            int[] temp = new int[0];
            return temp;
        }
        String[] res2 = res.split(" ");
        
        int[] fin = new int[res2.length];
        
        int idx = 0;
        for(int i=0; i<res2.length; i++) {
            fin[idx++] = Integer.parseInt(res2[i]);
        }
        return fin;
    }
}

// ===========================================================

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int top = 0;
        int bottom = 0;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List<Integer> al = new ArrayList<>();
        
        while(top < nums1.length && bottom < nums2.length) {
            if(nums1[top] == nums2[bottom]) {
                al.add(nums1[top]);
                top++;
                bottom++;
            }
            else if(nums1[top] < nums2[bottom]) {
                top++;
            } else {
                bottom++;
            }
        }
        
        return al.stream().mapToInt(i->i).toArray();
    }
}
// ==========================================================
// with HashMap

//import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int n1:nums1) {
            hm.put(n1, hm.getOrDefault(n1, 0)+1);
        }
        //System.out.println(hm.entrySet());
        ArrayList<Integer> al = new ArrayList<>();
        for(int n2 : nums2) {
            if(hm.containsKey(n2) && hm.get(n2) > 0) {
                al.add(n2);
                hm.put(n2, hm.get(n2)-1);
            }
        }
        return al.stream().mapToInt(i -> i).toArray();
    }
}