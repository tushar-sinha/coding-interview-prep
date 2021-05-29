/**
Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.

 

Example 1:

Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.
Example 2:

Input: paragraph = "a.", banned = []
Output: "a"
 */

import java.util.regex.*;
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> hm = new HashMap<>();
        String[] arr = paragraph.split("\\b|\\.|\\,");
        Pattern p = Pattern.compile("[a-zA-Z]+");
        for(String s:arr) {
            s = s.toLowerCase();
            Matcher m = p.matcher(s);
            if(m.matches() && !Arrays.asList(banned).contains(s)) {
                hm.put(s,hm.getOrDefault(s,0)+1);
            }
        }
        int max = -1;
        String res = "";
        for(Map.Entry e : hm.entrySet()) {
            System.out.println(e);
            if(Integer.parseInt(e.getValue().toString()) > max) {
                max = Integer.parseInt(e.getValue().toString());
                res = e.getKey().toString();
            }
        }
        return res;
    }
}