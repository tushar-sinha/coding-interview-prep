// https://leetcode.com/problems/merge-sorted-array/submissions/

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int end = nums1.length-1;
        m--;
        n--;
        while(end>=0 && m >= 0 && n >= 0) {
            if(nums1[m] > nums2[n]) {
                nums1[end--] = nums1[m--];
            } else {
                nums1[end--] = nums2[n--];
            }
        }
        while(n >= 0) {
            nums1[end--] = nums2[n--];
        }
    }