/**
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for(String s:strs) {
            char[] chArr = s.toCharArray();
            Arrays.sort(chArr);
            String st = String.valueOf(chArr);
            if(!hm.containsKey(st)) hm.put(st, new ArrayList<String>());
            hm.get(st).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}

//==============================WITHOUT SORT========================================

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        int[] cnt = new int[26];
        for(String s:strs) {
            Arrays.fill(cnt,0);
            for(char ch:s.toCharArray()) cnt[ch-'a']++;
            
            String str = "";
            for(int i:cnt) {
                str += "#"+i;   
            }
            if(!hm.containsKey(str)) hm.put(str, new ArrayList<String>());
            hm.get(str).add(s);
        }
        return new ArrayList(hm.values());
    }
}