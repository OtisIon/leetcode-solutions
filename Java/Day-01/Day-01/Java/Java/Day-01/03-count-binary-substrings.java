// Name: Rohit Mishra

/*
Count substrings with equal consecutive 0s and 1s.

Example:
Input: "00110011"
Output: 6
*/

class Solution {
    public int countBinarySubstrings(String s) {
        int prev = 0;   // previous group size
        int curr = 1;   // current group size
        int count = 0;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++; // same group → increase size
            } else {
                count += Math.min(prev, curr); // add valid substrings
                prev = curr; // update prev
                curr = 1;    // reset current
            }
        }

        count += Math.min(prev, curr); // last group
        return count;
    }
}
