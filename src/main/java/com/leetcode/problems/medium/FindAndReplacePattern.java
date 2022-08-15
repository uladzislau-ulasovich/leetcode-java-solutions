package com.leetcode.problems.medium;

import java.util.Arrays;
import java.util.List;

// Solution results overview:
// Runtime: 3 ms, faster than 51.18% of Java online submissions for Find and Replace Pattern.
// Memory Usage: 43.3 MB, less than 34.99% of Java online submissions for Find and Replace Pattern.
public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        return Arrays.stream(words).filter(word -> isValidPermutation(word, pattern)).toList();
    }

    private boolean isValidPermutation(final String word, final String pattern) {
        for (int i = 0; i < word.length(); i++) {
            if (word.indexOf(word.charAt(i)) != pattern.indexOf(pattern.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}