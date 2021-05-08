// https://leetcode.com/problems/valid-palindrome/
/*
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */

import java.util.regex.*;
class Solution {
    public boolean isPalindrome(String s) {
        Pattern p = Pattern.compile("([a-zA-Z0-9]+)");
        Matcher m = p.matcher(s);
        StringBuilder sb = new StringBuilder();
        while(m.find()) {
            sb.append(m.group(1));
        }
        String str = sb.toString().toLowerCase();
        String res = sb.reverse().toString().toLowerCase();
        return str.equals(res);
    }
}

// =====================================================

public class Solution {
    public boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }
}

// ======================================================

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        
        while (left < right){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);
            
            //if c1 is not valid then move forward
            if (!Character.isLetterOrDigit(c1)) left++;
            // if c2 is not valid move backward
            else if (!Character.isLetterOrDigit(c2)) right--;
            // otherwise compare
            else{
                if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) return false;    
                left++;
                right--;    
            }
        }
        
        return true;
    }
}