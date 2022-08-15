package com.leetcode.problems.easy;

import java.util.Map;

// Solution results overview:
// Runtime: 16 ms, faster than 19.98% of Java online submissions for Roman to Integer.
// Memory Usage: 42.9 MB, less than 87.42% of Java online submissions for Roman to Integer.
// For better (faster) results take a look at FastRomanToInt
public class RomanToInt {
    public int romanToInt(final String romanNumber) {
        return new RomanNumber(romanNumber).intValue();
    }

    private static class RomanNumber {
        private final String roman;

        public RomanNumber(final String roman) {
            this.roman = roman;
        }

        public int intValue() {
            final String[] tokens = roman.split("");

            int sum = 0;

            for (var i = 0; i < tokens.length; i++) {
                if (i < tokens.length - 1 && intValues.containsKey(tokens[i] + tokens[i + 1])) {
                    sum += intValues.get(tokens[i] + tokens[i + 1]);
                    i++;
                    continue;
                }
                sum += intValues.get(tokens[i]);
            }

            return sum;
        }

        private final static Map<String, Integer> intValues = Map.ofEntries(
                Map.entry("I", 1),
                Map.entry("V", 5),
                Map.entry("X", 10),
                Map.entry("L", 50),
                Map.entry("C", 100),
                Map.entry("D", 500),
                Map.entry("M", 1000),
                Map.entry("IV", 4),
                Map.entry("IX", 9),
                Map.entry("XL", 40),
                Map.entry("XC", 90),
                Map.entry("CD", 400),
                Map.entry("CM", 900)
        );
    }
}
