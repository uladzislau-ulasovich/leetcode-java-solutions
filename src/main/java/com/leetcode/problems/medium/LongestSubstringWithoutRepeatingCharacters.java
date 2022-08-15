package com.leetcode.problems.medium;

import java.util.HashSet;
import java.util.Set;

// Submission results:
// Runtime: 7 ms, faster than 82.67% of Java online submissions for Longest Substring Without Repeating Characters.
// Memory Usage: 42.5 MB, less than 91.35% of Java online submissions for Longest Substring Without Repeating Characters.
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        var leftBoundary = 0;
        int rightBoundary = 0;
        int result = 0;

        final Set<Character> met = new HashSet<>();

        while (rightBoundary < s.length()) {
            final char currentChar = s.charAt(rightBoundary);
            if (met.contains(currentChar)) {
                result = Math.max(met.size(), result);
                met.remove(s.charAt(leftBoundary));
                leftBoundary++;
            } else {
                met.add(currentChar);
                rightBoundary++;
            }
        }
        return Math.max(met.size(), result);
    }
}
