package slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Time Complexity: O(N)
 */
public class LongestSubStrWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        int i=0, j=0, maxLength=0;
        Map<Character,Integer> seen = new HashMap<>();

        while (i<s.length() && j<s.length()) {
            char c = s.charAt(j);
            if (seen.containsKey(c) && seen.get(c) >=i) {
                i = seen.get(c) + 1;
            } else {
                seen.put(c, j);
                j++;
            }
            maxLength = Math.max(maxLength, j-i);
        }
        return maxLength;
    }
}
