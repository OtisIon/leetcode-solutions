// Name: Rohit Mishra

/*
Find length of longest substring without repeating characters.

Example:
Input: "abcabcbb"
Output: 3
*/

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>(); // store current window
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left)); // remove from left
                left++;
            }

            set.add(s.charAt(right)); // add new char
            maxLength = Math.max(maxLength, right - left + 1); // update max
        }

        return maxLength;
    }
}
